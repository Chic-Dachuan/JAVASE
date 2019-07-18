package cn.edu360.javase24.TreadDemo;

public class ShellRunnable implements Runnable {
    private KuCun kuCun;
    public ShellRunnable(KuCun kuCun){
        this.kuCun = kuCun;
    }

    @Override
    public void run() {
        /**
         * 线程安全  --- 当出现共用数据时就可能出现线程安全
         */

        while (true){
            // System.out.println("本线程是无敌的");
            synchronized (ShellRunnable.class) {  // 线程锁
                /**
                 * 加一把锁，表示锁住的逻辑同时只能让一个线程来执行
                 */
                 if (kuCun.num > 0) {
                    try {
                        Thread.sleep(50);
                        this.kuCun.num -= 1;
                        System.out.println(this.kuCun.num);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                 }
                 if (kuCun.num == 0){
                     break;
                 }
                // System.out.println("从今往后，你们会记住一个人的名字，孙悟空");
            }
        }
    }
}
