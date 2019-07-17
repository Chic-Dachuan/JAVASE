package cn.edu360.javase24.day13.SocketDemo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TreadServerDemo {
    public static void main(String[] args) {
        try {
            ServerSocket socket = new ServerSocket(8080);
            //noinspection InfiniteLoopStatement
            while (true) {
                try {
                    Socket server = socket.accept();
                    CommServer talk = new CommServer(server);
                    new Thread(talk).start();
                } catch (Exception e) {
                    //noinspection ThrowablePrintedToSystemOut
                    System.out.println(e);
                }
            }
        }catch (Exception e){
            System.out.println("链接失败");
        }
    }
}
