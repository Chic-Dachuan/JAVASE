package cn.edu360.javase24.day02;

import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String [] args){
        float[] scoreArr = new float[5];  // 数组定义
        int[] Arr2 = new int[10];
        for(int i = 0; i < Arr2.length; ++i) {
            Arr2[i] = i;
        }
        for (int i = 9; i >= 0 ; --i) {
            System.out.println(Arr2[i]);
        }
        String[] name = new String[5];  // 定义字符串类型数组
        // name = {"语文", "数学", "英语", "物理", "化学"};
        Scanner scan = new Scanner(System.in);
        float scores = 0;
        for (int i = 0; i < 5; ++i) {
            System.out.println("请输入成绩:");
            String line = scan.nextLine();
            scoreArr[i] = Float.parseFloat(line);
            scores += scoreArr[i];
        }
        System.out.println("总分为：" + scores);
        System.out.println("平均分：" + (scores / scoreArr.length));
    }
}
