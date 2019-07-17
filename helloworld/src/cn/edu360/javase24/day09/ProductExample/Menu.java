package cn.edu360.javase24.day09.ProductExample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException {
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        ProductDao dao = new ProductDaoImpl();
        while (flag){
            System.out.println("1.添加商品 \t\t 2.查看商品 \t\t 3.退出");
            String line = scan.nextLine();
            switch (line){
                case "1":
                    System.out.println("请输入商品信息");
                    String nextline = scan.nextLine();
                    dao.addProduct(nextline);
                    break;
                case "2":
                    ArrayList<Productes> productes = dao.getAllProducts();
                    for (Productes p: productes
                         ) {
                        System.out.println(p);
                    }
                    break;
                case "3":
                    flag = false;
                    break;
                default:
                    System.out.println("Fuck out!");
                    break;
            }
        }
    }
}
