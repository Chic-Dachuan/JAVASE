package cn.edu360.javase24.day13.MultiThreading;

public class ThreadingDemo implements Runnable {
    /**
     * 向run()方法传递参数
     */
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i< 6; ++i) {
            System.out.println("啊......" + this.name);
        }
    }
}
