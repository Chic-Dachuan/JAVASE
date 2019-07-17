package cn.edu360.javase24.SortTools;

import cn.edu360.javase24.day06.HomeWork.Products;
import cn.edu360.javase24.day06.HomeWork.Users;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionTest {
    public static void main(String[]args){
        Products p1 = new Products("1", "a", 11f,12);
        Products p2 = new Products("2", "b", 8f,12);
        Products p3 = new Products("3", "c", 21f,12);
        Products p4 = new Products("4", "d", 33f,12);
        ArrayList<Products> pList = new ArrayList<>();
        pList.add(p1);
        pList.add(p2);
        pList.add(p3);
        pList.add(p4);

        /**
         * 用collections工具来排序
         * 方式1.传专门的比较器给工具，本方式最通用
         */
        Collections.sort(pList, new Comparator<Products>() {
            @SuppressWarnings("ComparatorMethodParameterNotUsed")
            @Override
            public int compare(Products o1, Products o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                }
                return -1;
            }
        });

        /**
         * 方式2. 数据类型本身可以比较
         * 这种方法要求数据类型本身实现compareTo()方法
         */
        Users u1 = new Users("1", "嫦娥", 18, 100f);
        Users u2 = new Users("2", "吴刚", 18, 1200f);
        Users u3 = new Users("3", "八戒", 8, 1020f);
        Users u4 = new Users("4", "玉兔", 3, 90f);
        ArrayList<Users> uList = new ArrayList<>();
        uList.add(u1);
        uList.add(u2);
        uList.add(u3);
        uList.add(u4);
        Collections.sort(uList);
    }
}
