package cn.edu360.javase24.day13.SocketDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8080);
        OutputStream out =  socket.getOutputStream();
        InputStream in = socket.getInputStream();
        byte[] buff = new byte[1024];
        String string;
        int readNum;
        boolean flag = true;
        Scanner scan = new Scanner(System.in);

        while (flag){
            String data = scan.nextLine();
            out.write(data.getBytes());
            readNum = in.read(buff);
            string = new String(buff, 0, readNum);
            System.out.println(string);
            if (string.equals("see you")){
                flag = false;
            }
        }
        out.close();
        in.close();
        socket.close();
    }
}
