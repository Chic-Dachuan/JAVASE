package cn.edu360.javase24.day13.SocketDemo;

import cn.edu360.javase24.day13.DataFind.Data;
import cn.edu360.javase24.day13.DataFind.Find;

import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThreadIng implements Runnable {
    private Socket server;
    private Find serch = new Find();
    public ServerThreadIng(Socket server) {
        this.server = server;
    }

    @Override
    public void run() {
        boolean flag = true;
        while (flag) {
            try {
                /**
                 * 拿到字节流
                 */
                OutputStream out = this.server.getOutputStream();
                InputStream in = this.server.getInputStream();
                /**
                 * 转换为对象流
                 */
                ObjectOutputStream Oout = new ObjectOutputStream(out);

                byte[] buff = new byte[1024];
                int readNum = in.read(buff);
                String string = new String(buff, 0, readNum);
                /**
                 * 协议规定
                 * 1.select * from p.dat where id=3
                 * 2.select * from p.dat where name=apple
                 */
                // 获取id或name方法
                // 1.
                // String commod =  string.substring(string.indexOf("=") + 1);  // string.indexOf("=")  获取某个符号(=)所在位置
                // string.substring() 从某个地方开始获取一段字符串
                // 2. 字符串切割
                String[] str = string.split(" ");
                if (str[5].contains("id=")) {
                    String[] str1 = str[5].split("=");
                    int id = Integer.parseInt(str1[1]);
                    Data data = this.serch.findDataById(id);
                    out.write(data.toString().getBytes());

                } else if (str[5].contains("name=")) {
                    String[] str1 = str[5].split("=");
                    String name = str1[2];
                    ArrayList<Data> dList = (ArrayList<Data>) this.serch.findDataByName(name);
                    out.write(dList.toString().getBytes());
                } else {
                    out.write("Con't find your requisite".getBytes());
                }
            } catch (Exception e) {
                System.out.println("链接中断");
                flag = false;
            }
        }
    }
}
