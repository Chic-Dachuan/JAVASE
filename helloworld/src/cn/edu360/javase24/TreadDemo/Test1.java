package cn.edu360.javase24.TreadDemo;

import java.util.HashMap;

public class Test1 {
    public static void main(String[] args){
//        ProductDb pdb = new ProductDb();
//        HashMap<String, String> pmp = pdb.pMap;
        // ProductDb pdb = ProductDb.getProductDb();
        // System.out.println(pdb);

        /**
         * 多线程去拿这个单例对象
         * cn.edu360.javase24.TreadDemo.ProductDb@7e8a7875
         * cn.edu360.javase24.TreadDemo.ProductDb@45d6019e
         * 线程安全问题  导致两个对象不一样  线程竞争
         */
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ProductDb pdb = ProductDb.getProductDb();
                System.out.println(pdb);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ProductDb pdb = ProductDb.getProductDb();
                System.out.println(pdb);
            }
        });
        t1.start();
        t2.start();
    }


}
