package cn.edu360.javase24.day04.ArrayListTest;

import java.util.ArrayList;

public class NumPair {
    private int a;  // 一个文件就是一个类
    private int b;  // 私有属性，类外不能使用
    public NumPair(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int getsum(){
        return this.a + this.b;
    }

    // 用来对一个list排序
    public static void sort(ArrayList<Integer> list1){
        for (int i = 0; i < list1.size(); ++i){
            for (int j = 0; j < list1.size() - 1 - i; ++j){
                if (list1.get(j) > list1.get(j + 1)){
                    int tmp = list1.get(j);
                    list1.set(j, list1.get(j + 1));
                    list1.set(j + 1, tmp);
                }
            }
        }
    }

    public static void print(ArrayList<Integer> list1){
        for (int k = 0; k < list1.size(); ++k){
            System.out.println(list1.get(k));
        }
    }

    /**
     * 静态方法 与具体对象没有关系
     * 可以直接用类名来调用
     * 非静态方法就是对像方法
      */
    public static void seeHello(){
        System.out.println("Welcome to China");
    }


    public static void main(String[] args){
        NumPair num = new NumPair(12, 13);
        num.a = 1;
    }

}
