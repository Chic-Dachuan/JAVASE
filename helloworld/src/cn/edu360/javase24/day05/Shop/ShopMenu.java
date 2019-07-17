package cn.edu360.javase24.day05.Shop;

import cn.edu360.javase24.day05.TestLoL;

import java.util.Scanner;

public class ShopMenu {
    public static void main(String[] args){
        System.out.println("-**- 欢迎您来到小牛商城 -**-" + "\n1.浏览商品 \t\t 2.退出");
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        ProductMan manual = new ProductMan();
        TestLoL.CreatProducts(manual);

        // 构造购物车
        ShopCar car = new ShopCar();

        while (flag){
            String commod = scan.nextLine();
            switch (commod){
                case "1":{
                    // ProductMan manual = new ProductMan();
                    manual.showProducts();
                    System.out.println("亲，请输入需要购买商品的编号");
                    String selectpds = scan.nextLine();
                    Product select = manual.getPds().get(Integer.parseInt(selectpds));
                    select.showProduct();
                    System.out.println("请输入需要购买的数量:");
                    String num = scan.nextLine();
                    car.addCart(select);
                    select.setPayNum(Integer.parseInt(num));
                    car.showInfo();
                    break;
                }
                case "2":{
                    flag = false;
                    break;
                }
                default:{
                    System.out.println("输入错误, 请重新输入!");
                    System.out.println("-**- 欢迎您来到小牛商城 -**-" + "\n1.浏览商品 \t\t 2.退出");
                }
            }
        }
    }
}
