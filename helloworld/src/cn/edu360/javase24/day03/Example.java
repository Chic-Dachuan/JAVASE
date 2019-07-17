package cn.edu360.javase24.day03;

import java.util.Scanner;

public class Example {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Info[] customer = new Info[3];
        String[] spl = new String[6];
        int tage = 0;
        for (int i = 0; i < customer.length; ++i){
            // 字符串切割
            System.out.println("请输入第" + (i + 1) + "用户的信息:");
            String line = scan.nextLine();
            spl = line.split(",");
            customer[i] = new Info(spl[0], spl[1], Integer.parseInt(spl[2]), spl[3], spl[4], spl[5]);
            tage += customer[i].age;
        }
        int tmp = 0;
        for (int j = 1; j < customer.length; ++j){
            if (customer[j].age > customer[tmp].age){
                tmp = j;
            }
        }
        System.out.println("平均年龄为: " + (tage / customer.length));
        System.out.println("年龄最大的是：" + customer[tmp].name + " " + customer[tmp].age);;
    }
}
