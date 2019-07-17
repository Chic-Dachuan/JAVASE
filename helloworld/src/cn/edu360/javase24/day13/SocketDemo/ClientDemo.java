package cn.edu360.javase24.day13.SocketDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args){
        // 向服务端请求
        try {
            Socket socket = new Socket("127.0.0.1", 10000);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("Who Are You!".getBytes());

            /**
             * 接收数据
             */
            byte[] buff = new byte[1024];
            InputStream inputStream = socket.getInputStream();
            int read;
            while ((read = inputStream.read(buff)) != -1){  // read()方法返回读取的字节数
                String string = new String(buff, 0, read);
                System.out.println(string);
            }
            inputStream.close();
            outputStream.close();
            socket.close();
        }catch (IOException e){
            System.out.println("链接失败");
        }
    }
}
