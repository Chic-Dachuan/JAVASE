package cn.edu360.javase24.SortTools;

import cn.edu360.javase24.day06.HomeWork.Users;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test2 {
    public static void main(String [] args){
        SortUtil2<Integer> sortUtil2 = new SortUtil2<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; ++i){
            list.add(i);
        }
        sortUtil2.sort(list, new CompareInt());
        for (Integer a: list
             ) {
            System.out.println(a);
        }

        // 匿名内部类
        SortUtil2<String> sortUtil21 = new SortUtil2<>();
        ArrayList<String> list1 = new ArrayList<>();
        sortUtil21.sort(list1, new Compare2<String>() {  // 相当于创建一个类，再用这个类创建一个对象
            // 具体实现写在这儿
            @Override
            public boolean compared(String u1, String u2) {
                return u1.equals(u2);
            }
        });

        //
        Collections.sort(list, new Comparator<Integer>() {
            /**
             * 返回正数 表示 o1 > o2
             * 返回负数 表示 o1 < o2
             * 返回零   表示 o1 = o2
             * @param o1
             * @param o2
             * @return
             */
            @Override
            public int compare(Integer o1, Integer o2) {
                // 具体实现需要自己写
                return 0;
            }
        });
        Users u1 = new Users("1", "嫦娥", 18, 100f);
        Users u2 = new Users("2", "吴刚", 18, 1200f);
        Users u3 = new Users("3", "八戒", 8, 1020f);
        Users u4 = new Users("4", "玉兔", 3, 90f);
        ArrayList<Users> uList = new ArrayList<>();
        uList.add(u1);
        uList.add(u2);
        uList.add(u3);
        uList.add(u4);

        /**
         * jdk中现成的工具Collections
         * 框架内部通过调用User的compareTo方法来实现
          */


        Collections.sort(uList);
    }
}
