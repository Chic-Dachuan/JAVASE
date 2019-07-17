package cn.edu360.javase24.day13.SocketDemo;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class SendData implements Runnable {
    private OutputStream out;

    SendData(OutputStream out) {
        this.out = out;
    }

    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        String string;
        //noinspection InfiniteLoopStatement
        boolean flage = true;
        while (flage) {
            try {
                string = scan.nextLine();
                this.out.write(string.getBytes());
            } catch (Exception e) {
                try {
                    out.close();
                    System.out.println("链接断开");
                    flage = false;
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                System.out.println("发送失败...");
            }
        }
    }
}
