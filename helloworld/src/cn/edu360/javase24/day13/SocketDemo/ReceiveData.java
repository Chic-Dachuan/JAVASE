package cn.edu360.javase24.day13.SocketDemo;

import java.io.IOException;
import java.io.InputStream;

public class ReceiveData implements Runnable {
    private InputStream in;
    private byte[] buff;
    private String string;

    public String getString() {
        return string;
    }

    ReceiveData(InputStream in, byte[] buff) {
        this.in = in;
        this.buff = buff;
    }

    @Override
    public void run() {
        boolean flag = true;
        while (flag) {
            try {
                int num = this.in.read(buff);
                this.string = new String(buff, 0, num);
                System.out.println(this.string);
            } catch (Exception e) {
                try {
                    this.in.close();
                    System.out.println("链接断开");
                    flag = false;
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                //noinspection ThrowablePrintedToSystemOut
                System.out.println(e + "111");
            }
        }
    }
}
