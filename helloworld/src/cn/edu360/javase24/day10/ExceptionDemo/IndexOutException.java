package cn.edu360.javase24.day10.ExceptionDemo;

import java.util.Scanner;

/**
 * 异常就是程序在运行期间可能出现的非预期不正常状况，这个状况导致整个程序无法继续运行
 */
public class IndexOutException{
    public static void main(String[] args){
        // int[] arr = new int[5];
        /**
         * ArrayIndexOutOfBoundsException
         */
        // arr[8] = 10;
        /**
         * ListTool listTool = new ListTool();
         *         int[] arr = new int[]{1, 2, 3};
         *         int a = listTool.getIntFromArr(arr, 6);
         */
        ListTool listTool = new ListTool();
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[]{1, 2, 3};
        //noinspection InfiniteLoopStatement
        while (true) {
            String index = scan.nextLine();
            try {
                int a = listTool.getIntFromArr(arr, Integer.parseInt(index));
                System.out.println(a);
            }catch (Exception e){
                System.out.println("Fuck Off");
            }
            /**
             * NumberFormatException 数字格式异常
             */
            /**
             * ArithmeticException 除0异常
             */
//            int c = 3;
//            int b = 0;
//
//                System.out.println((c / b));

            System.out.println("once again");
        }
    }
}
