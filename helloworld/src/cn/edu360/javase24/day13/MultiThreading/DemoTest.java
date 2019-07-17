package cn.edu360.javase24.day13.MultiThreading;

import org.junit.Test;

public class DemoTest {
    // @Test
    public void test(){
        ThreadingDemo demo = new ThreadingDemo();
        /**
         * 多线程不是这么直接调用run()方法
         * 这样调用就是单线程普通的执行一下run方法
         */
        demo.run();
    }
    public static void main(String[] args){
        ThreadingDemo demo1 = new ThreadingDemo();
        demo1.setName("张三");
        ThreadingDemo demo2 = new ThreadingDemo();
        demo2.setName("李四");
        ThreadingDemo1 demo3 = new ThreadingDemo1();
        demo3.setName("王五");
        ThreadingDemo1 demo4 = new ThreadingDemo1();
        demo4.setName("狗大");
        /**
         * 多线程调用框架
         * Thread() 传递一个ThreadingDemo()类型的数据
         * 这个线程需要执行的逻辑就是传递一个ThreadingDemo类中run方法中的逻辑
         */
        Thread threading = new Thread(demo1);
        Thread threading2 = new Thread(demo2);

        /**
         * 多个线程执行
         * 就多创建几个Thread类型
         * 每个线程可以是同一块逻辑，也可以是不同的逻辑
         */

        /**
         * 启动线程start() 方法
         */
        Thread threading1 = new Thread(demo3);
        Thread threading3 = new Thread(demo4);
        threading.start();
        threading1.start();
        threading2.start();
        threading3.start();

        // 当调用run方法
        /**
         * 这是在单线程中按照先后顺序运行
         */
//        threading.run();
//        threading1.run();
//        threading2.run();
//        threading3.run();
    }
}
