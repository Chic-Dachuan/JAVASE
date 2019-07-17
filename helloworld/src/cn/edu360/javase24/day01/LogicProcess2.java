package cn.edu360.javase24.day01;

import java.util.Scanner;

/**
 * 逻辑判断
 */
public class LogicProcess2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int a = 3;
        int b = 4;
        // 如果name是Tom输出-->欢迎您，Tom
        if(a == b){  // 判断两个字符串是否一样不能用== 它是一个字符串对象
            // 两个对象不能相等， 用equals()方法
            // 数字类型直接用==判断是否相等
            System.out.println("欢迎您，" + name);
        }else if (a < b){
            System.out.println("你好, " + name);
        }else {
            System.out.println("Fuck Out!");
        }
    }
}
