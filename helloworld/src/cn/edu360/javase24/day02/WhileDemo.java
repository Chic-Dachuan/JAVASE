package cn.edu360.javase24.day02;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args){
        int num = 9;
        // 让用户输入数字
        boolean flages = true;
        Scanner scan = new Scanner(System.in);
        while (flages) {
            System.out.println("请输入一个数字：");
            String guess = scan.nextLine();
            // 解析数字
            int userguess = Integer.parseInt(guess);
            if (userguess > 9) {
                System.out.println("猜错了，大了！");
            } else if (userguess < 9) {
                System.out.println("猜错了， 小了!");
            } else {
                System.out.println("Congratulation!");
                // flages = false;
                break;
            }
        }
        System.out.println("Game Over!");
    }
}
