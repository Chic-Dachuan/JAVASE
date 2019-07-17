package cn.edu360.javase24.day04.ArrayListTest;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args){
        ArrayList<Integer> list1 =  new ArrayList<Integer>();
        list1.add(12);
        list1.add(2);
        list1.add(15);
        list1.add(13);
        NumPair num = new NumPair(12, 13);
        num.sort(list1);
        num.print(list1);
        NumPair.seeHello();  // 静态方法
        /**
         * 静态方法对象不能调用
         * 类可以调用   类对象
          */

    }
}
