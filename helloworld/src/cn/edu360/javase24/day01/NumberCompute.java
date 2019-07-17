package cn.edu360.javase24.day01;

import java.util.Scanner;

public class NumberCompute {
    public static void main(String [] args){
        // 创建出一个用于获取终端输入的工具
        Scanner scan = new Scanner(System.in);

        String number1 = scan.nextLine();
        String number2 = scan.nextLine();
        // 利用工具把字符串转换为整形等数据类型
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        float num3 = (float)num1 / num2;
        System.out.println("两数相加的结果" + (num1 + num2));
        System.out.println(num3);

    }
}
