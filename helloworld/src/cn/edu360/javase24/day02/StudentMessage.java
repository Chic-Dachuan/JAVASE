package cn.edu360.javase24.day02;

import java.util.Scanner;

public class StudentMessage {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        StudentInfo[] stu = new StudentInfo[10];  // 对象数组
        StudentInfo stu1 = new StudentInfo();
        stu1.name = scan.nextLine();
        stu1.stuNum = scan.nextLine();
        stu1.age = Integer.parseInt(scan.nextLine());
        stu1.score = Float.parseFloat(scan.nextLine());
        System.out.println(stu1);
    }
}
