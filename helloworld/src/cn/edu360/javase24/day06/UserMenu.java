package cn.edu360.javase24.day06;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        User u = new User("a", "1");
        UserDataBase.userMap.put("a", u);
        UserManage userManage = new UserManageImpl();
        boolean flage = true;
        while (flage) {
            System.out.println("1. 登陆\t\t2.注册\t\t3.退出");
            String commod = scan.nextLine();
            switch (commod) {
                case "1":
                    System.out.println("请输入账号: ");
                    String name = scan.nextLine();
                    System.out.println("请输入密码: ");
                    String pwd = scan.nextLine();

                    // 调用业务逻辑登陆界面
                    boolean login = userManage.login(name, pwd);
                    if (login) {
                        System.out.println("欢迎您," + name);
                    } else {
                        System.out.println("对不起，用户名或密码错误!");
                    }
                    break;
                case "2":
                    System.out.println("请输入用户名: ");
                    String username = scan.nextLine();
                    System.out.println("请输入密码: ");
                    String userpwd = scan.nextLine();
                    System.out.println("请确认密码: ");
                    String userpwd2 = scan.nextLine();
                    String RES = userManage.regist(username, userpwd, userpwd2);
                    switch (RES) {
                        case "1":
                            System.out.println("亲，您两次密码不一致!");
                            break;
                        case "2":
                            System.out.println("亲，该用户名已存在");
                            break;
                        case "3":
                            System.out.println("注册成功");
                            break;
                        default:
                            break;

                    }
                    break;
                case "3":
                    System.out.println("Bye Bye");
                    flage = false;
                    break;
                default:
                    System.out.println("您输入有误，请重新输入!");
            }

        }
    }
}
