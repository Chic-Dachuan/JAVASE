package cn.edu360.javase24.day10.Reflect;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception{
        System.out.println("1.登陆\t\t2.注册\t\t3.退出");
        Scanner scan = new Scanner(System.in);
        /**
         * 从约定的文件中读取Service层实现类的类全名
         * 根据类全名构造这个Service实现类的实例
         */
        String path = "./src/cn/edu360/javase24/day10/Reflect/a.txt";

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        String serviceClassName = bufferedReader.readLine();
        Class<?> forName = Class.forName(serviceClassName);  // 反射
        /**
         * 根据读到的文件字符串
         * 把实现类模板加载到内存，并返回一个模板对象
         * 用这个模板对象的newInstance()方法创建一个Object类需要强转成一个对应的类
         * 文件中可以写多个实现类的路径条目
         */
        UserRegisterService regs = (UserRegisterService) forName.newInstance();

        boolean flag = true;
        while (flag){
            String select = scan.nextLine();
            switch (select){
                case "1":
                    break;
                case "2":
                    System.out.println("请输入账户");
                    String name = scan.nextLine();
                    System.out.println("请输入密码");
                    String pwd1 = scan.nextLine();
                    System.out.println("请再次输入密码");
                    String pwd2 = scan.nextLine();
                    boolean checkIfExist = regs.checkIfExist(name);
                    if (checkIfExist){
                        System.out.println("用户名已存在");
                        break;
                    }
                    boolean registerUs = regs.registerUser(name, pwd1, pwd2);
                    if (registerUs){
                        System.out.println("注册成功");
                        break;
                    }
                    break;
                case "3":
                    System.out.println("see you");
                    flag = false;
                default:
                    System.out.println("Input Wrong");
            }
        }
    }
}
