package cn.edu360.javase24.day01;  // 声明类在那个文件下面

import java.util.Scanner;

public class see {  // 类名和文件名必须一致
    public static void main(String[] args){  // 程序入口
        // 创建一个jdk中用于获取终端输入信息的工具。
        // 定义了一个变量来代表创建出来的工具
        Scanner scanner = new Scanner(System.in);

        // 用工具从终端上获取用户输入一行文字
        String name = scanner.nextLine();

        // 拼接新的字符串
        String result = name + "好美" + name + "好坏";
        System.out.println(result);
    }
}
