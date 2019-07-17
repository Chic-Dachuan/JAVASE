package DataFind;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.util.List;

public class FindDataUitl {
    public Find getInstance(){
        Find findData = (Find) Proxy.newProxyInstance(Find.class.getClassLoader(),
                new Class<?>[]{Find.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 具体逻辑
                        String name = method.getName();
                        // 请求远程服务器
                        Socket socket = new Socket("127.0.0.1", 8080);

                        OutputStream out = socket.getOutputStream();
                        InputStream in = socket.getInputStream();

                        if (name.equals("findDataById")){
                            // 请求远程服务器

                            /**
                             * 发送请求
                             */
                            out.write(("select * from p.dat where id=" + args[0]).getBytes() );
                            /**
                             * 接收数据
                             */
                            byte[] buff = new byte[1024];
                            int readNum = in.read(buff);
                            String pdstr = new String(buff, 0, readNum);
                            String[] spl = pdstr.split(",");
                            Data data = new Data(Integer.parseInt(spl[0]), spl[1], Float.parseFloat(spl[2]));
                            in.close();
                            out.close();
                            socket.close();
                            return data;
                        }else {
                            /**
                             * 发送请求
                             */
                            out.write(("select * from p.dat where name=" + args[0]).getBytes() );
                            /**
                             * 接收数据
                             */
                            ObjectInputStream ois = new ObjectInputStream(in);
                            List<Data> dList = (List<Data>) ois.readObject();
                            in.close();
                            ois.close();
                            out.close();
                            socket.close();
                            return dList;
                        }
                    }
                });
        return findData;
    }
}
