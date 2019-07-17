package cn.edu360.javase24.day13.SocketDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class CommServer implements Runnable {
    private Socket server;

    CommServer(Socket server) {
        this.server = server;
    }

    @Override
    public void run() {
        try {
            /**
             * 获取输入输出流
             */
            OutputStream out = this.server.getOutputStream();
            InputStream in = this.server.getInputStream();
            /**
             * 接收数据线程
             */
            byte[] buff = new byte[1024];
            ReceiveData receive = new ReceiveData(in, buff);
            new Thread(receive).start();
            /**
             * 发送数据线程
             */
            SendData send = new SendData(out);
            new Thread(send).start();

        }catch (Exception e){
            try {
                this.server.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            System.out.println("发生异常了......");
        }
    }
}
