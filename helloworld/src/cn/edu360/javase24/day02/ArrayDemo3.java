package cn.edu360.javase24.day02;

import java.util.Random;

/**
 * 冒泡排序
 */
public class ArrayDemo3 {
    public static void main(String[] args){
        int[] Arr1 = new int[5];
        Random rand = new Random();
        for (int i = 0; i < Arr1.length; ++i){
            Arr1[i] = rand.nextInt(100);
            System.out.println(Arr1[i]);
        }
        // 冒泡排序
        for (int k = 0; k < Arr1.length - 1; ++k){
            for (int m = k + 1; m < Arr1.length; ++m){
                if (Arr1[k] < Arr1[m]){
                    int tmp = Arr1[k];
                    Arr1[k] = Arr1[m];
                    Arr1[m] = tmp;
                }
            }
        }
        System.out.println("排序结果:");
        for(int j = 0; j < Arr1.length; ++j ) {
            System.out.println(Arr1[j]);
        }
        // 冒泡排序
        for (int i = 0; i < Arr1.length - 1; ++i){
            for (int j = 0; j < Arr1.length - 1 - i; ++j){
                if (Arr1[j] > Arr1[j+1]){
                    int tmp = Arr1[j];
                    Arr1[j] = Arr1[j+1];
                    Arr1[j+1] = tmp;
                    System.out.println("hello world");
                }
            }
        }
        System.out.println("排序结果:");
        for(int j = 0; j < Arr1.length; ++j ) {
            System.out.println(Arr1[j]);
        }
    }
}
