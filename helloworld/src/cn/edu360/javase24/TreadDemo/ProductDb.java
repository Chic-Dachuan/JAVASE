package cn.edu360.javase24.TreadDemo;

import java.util.HashMap;
import java.util.Objects;

/**
 * 单例设计模式
 * 核心思想：这个类在程序的任何其他模块中获取它的对象时，拿到的永远时同一个对象
 */

public class ProductDb {
    public HashMap<String, String> pMap = new HashMap<>();
    /**
     * 单例  方法1
     */
    private static ProductDb pdb = null;
    private ProductDb(){

    }

    /**
     * 防止线程安全问题  通过加互斥锁
     * 方法1  直接加在方法上  缺点 太慢了  影响效率
     * @return
     */
//    public static synchronized ProductDb getProductDb(){
//        if (pdb == null){
//            pdb = new ProductDb();
//        }
//        return pdb;
//    }

    /**
     * 方法2  只需要锁住最前面的几个人
     */
        public static  ProductDb getProductDb() {
            if (pdb == null) {
                synchronized (ProductDb.class) {
                    if (pdb == null) {
                        pdb = new ProductDb();
                    }
                }
            }
            return pdb;
        }
}

