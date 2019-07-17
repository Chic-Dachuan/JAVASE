package cn.edu360.javase24.day13.SocketDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args){
        /**
         * 启动一个socket服务端 (本质就是向操作系统注册一个端口号，并且监听这个端口
         */
        try {
            ServerSocket server = new ServerSocket(10000);
            /**
             * 监听这个端口
             * accept() 这是一个阻塞方法  会一直等到有客户端链接发送过来
             */
            Socket accept = server.accept();  // 等待并接收客户端的请求 建立socket连接

            /**
             * 从连接中接收数据
             */
            InputStream inputStream = accept.getInputStream();

            /**
             * 从输入流中取数据
             */
            byte[] buff = new byte[1024];
            // inputStream.read(buff);
            int read = inputStream.read(buff);
            // while ( (read =inputStream.read(buff)) != -1) {  // 当没有内容的时候会返回-1
                // int read = inputStream.read();  // read()方法也是阻塞的，如果没有数据，也会在这儿等着
                String string = new String(buff, 0, read);  // 客户端  与 服务器端数据格式是约定的  即通信协议
                System.out.println(string);
            // }
            /**
             * 发送数据
             */
            OutputStream out = accept.getOutputStream();
            out.write("I am your father forever".getBytes());

            out.close();
            inputStream.close();
            accept.close();

        }catch (IOException e){
            System.out.println("端口被占用");
        }
    }
}
