package cn.edu360.javase24.day04;

import java.util.ArrayList;

public class OrderTest {
    public static void main(String [] args){
        Order od =  new Order();
        od.oId = "1";
        od.user =  new User("1", "张无忌", "黄金VIP");

        Product p1 = new Product("p1", "打神鞭", 18.8f, 1);
        Product p2 = new Product("p2", "捆仙锁", 18.9f, 2);
        /**
         * od.pds.add(p1);
         * od.pds.add(p2);
         * 不能这么使用
         */

        ArrayList<Product> pdl = new ArrayList<>();
        pdl.add(p1);
        pdl.add(p2);
        od.pds = pdl;

        // 调用方法计算总额
        od.setToamount();

        // 计算应付金额
        od.setTopay();
        System.out.println("订单总金额: " + od.amount +"\n订单应付: " + od.topay);

    }

}
