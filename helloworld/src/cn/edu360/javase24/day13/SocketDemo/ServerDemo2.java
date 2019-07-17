package cn.edu360.javase24.day13.SocketDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerDemo2 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        Socket socket = server.accept();
        byte[] buff = new byte[1024];
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
        boolean flag = true;
        String string;
        int readNum;
        Scanner scan = new Scanner(System.in);

        while (flag){
           readNum = in.read(buff);
           string = new String(buff, 0, readNum);
           System.out.println(string);
           String data = scan.nextLine();
           out.write(data.getBytes());
           if (data.equals("see you")) {
               flag = false;
           }
        }
        out.close();
        in.close();
        socket.close();
    }
}
