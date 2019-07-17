package cn.edu360.javase24.day02;

import java.util.Random;

public class ArrayDemo2 {
    public static void main(String [] args){
        int [] Arr = new int[5];
        Random rand = new Random();
        for (int i = 0; i < Arr.length; ++i){
            Arr[i] = rand.nextInt(20);
            // System.out.println(Arr[i]);
        }
        // 求最值
        int max = Arr[0];
        int min = Arr[0];
        for (int i = 0; i < Arr.length; ++i) {
            if (max < Arr[i]) {
                max = Arr[i];
            }
            if (min > Arr[i]) {
                min = Arr[i];
            }
        }
        // System.out.println(Arr);
        System.out.println("最大值为: " + max);
        System.out.println("最小值为: " + min);
    }
}
