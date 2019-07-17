package cn.edu360.javase24.day13.MultiThreading;

public class ThreadingDemo1 implements Runnable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i< 4; ++i) {
            System.out.println("噢......" + this.name);
        }
    }
}
