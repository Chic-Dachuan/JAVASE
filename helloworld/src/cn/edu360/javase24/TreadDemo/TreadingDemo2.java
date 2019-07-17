package cn.edu360.javase24.TreadDemo;

public class TreadingDemo2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; ++i){
            System.out.println(i);
        }
    }
}
