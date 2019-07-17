package cn.edu360.javase24.day13.SocketDemo;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo3 {
    public static void main(String[] args){
        //noinspection InfiniteLoopStatement
        while (true) {
            try {
                ServerSocket socket = new ServerSocket(3306);
                Socket server = socket.accept();
                ServerThreadIng sock = new ServerThreadIng(server);
                new Thread(sock).start();
            } catch (Exception e) {
                System.out.println("绑定端口失败");
            }
        }
    }
}
