package cn.edu360.javase24.TreadDemo;

public class TreadingDemo {
    public static void main(String[] args){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; ++i){
                    System.out.println("我爱你我的祖国!");
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; ++i){
                    System.out.println("我爱你，林志玲!");
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; ++i){
                    System.out.println("我爱你，凤姐!");
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
