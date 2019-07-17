package cn.edu360.javase24.day13.SocketDemo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TreadClientDemo {
    public static void main(String[] args){
        try {
            Socket socket = new Socket("127.0.0.1", 8080);
            OutputStream out =  socket.getOutputStream();
            InputStream in = socket.getInputStream();
            byte[] buff = new byte[1024];
            ReceiveData receive = new ReceiveData(in, buff);
            new Thread(receive).start();

            SendData send = new SendData(out);
            new Thread(send).start();

        }catch (Exception e){
            //noinspection ThrowablePrintedToSystemOut
            System.out.println(e);
        }
    }
}
