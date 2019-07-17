package cn.edu360.javase24.day04.ArrayListTest;
import cn.edu360.javase24.day04.Product;

import java.util.ArrayList;

/**
 * ArrayList数据类型,是一个集合数据类型
 */

public class ArrayList2 {
    public static void main(String[] args){
        Product p1 = new Product();
        p1.pId = "1";
        p1.pname = "肥皂";
        p1.price = 2.5f;
        p1.number = 1;
        Product p2 = new Product();
        p2.pId = "2";
        p2.pname = "手铐";
        p2.price = 25.5f;
        p2.number = 2;
        Product p3 = new Product();
        p3.pId = "1";
        p3.pname = "皮鞭";
        p3.price = 12.5f;
        p3.number = 1;
        Product p4 = new Product();
        p4.pId = "1";
        p4.pname = "锥子";
        p4.price = 22.5f;
        p4.number = 1;
        ArrayList<Product> pds = new ArrayList<Product>();
        pds.add(p1);
        pds.add(p2);
        pds.add(p3);
        pds.add(p4);
        float amount = 0;
        for(int j = 0; j < pds.size(); ++j){
            amount += pds.get(j).number * pds.get(j).price;
        }
        System.out.println("总额为: " + amount);
        // 所有商品单价最高的商品
        int max = 0;
        for (int k = 1; k < pds.size(); ++k){
            if (pds.get(max).price < pds.get(k).price){
                max = k;
            }
        }
        System.out.println("单价最高的商品: " + pds.get(max).pname +
                " \n 价格: " + pds.get(max).price);
        // 成交金额最大的商品
        max = 0;
        for (int m = 1; m < pds.size(); ++m){
            if ((pds.get(max).number * pds.get(max).price) <
                    (pds.get(m).number * pds.get(m).price)){
                max = m;
            }
        }
        System.out.println("成交金额最大为: " + pds.get(max).pname +
                "\n单价: " + pds.get(max).price +
                "\n金额: " + pds.get(max).price * pds.get(max).number);

        // 单价排名前三的商品
        for (int i = 0; i < pds.size() - 1; ++i){
            for (int j = 0; j < pds.size() - 1 -i; ++j){
                if (pds.get(j).price < pds.get(j + 1).price){
                    Product tmp = pds.get(j);
                    Product tmp2 = pds.get(j + 1);
                    pds.set(j, tmp2);
                    pds.set(j + 1, tmp);
                }
            }
        }
        System.out.println(">>>>>>>>>>>>>");
        pds.get(1).pint();
        System.out.println(">>>>>>>>>>>>>");
        for (int k = 0; k < pds.size(); ++k){
            System.out.println("单价排序: " + pds.get(k).pname +
                    ",价格: " + pds.get(k).price);
        }
    }
}

