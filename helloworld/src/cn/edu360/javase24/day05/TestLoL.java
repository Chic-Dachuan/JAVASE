package cn.edu360.javase24.day05;

import cn.edu360.javase24.day05.Shop.Product;
import cn.edu360.javase24.day05.Shop.ProductMan;

public class TestLoL {
    public static void main(String[] args){
        Product pds = new Product();
        pds.setName("丝袜");
        pds.setId("sex");
        pds.setNum(10);
        pds.setPrice(120.2f);

        Product pds1 = new Product();
        pds1.setName("手铐");
        pds1.setId("sex");
        pds1.setNum(20);
        pds1.setPrice(12.2f);

        ProductMan manul = new ProductMan();
        manul.addProduc(pds);
        manul.addProduc(pds1);
        manul.showProducts();
    }
    public static void CreatProducts(ProductMan manual){
        Product pds = new Product();
        pds.setName("丝袜");
        pds.setId("1");
        pds.setNum(10);
        pds.setPrice(120.2f);

        Product pds1 = new Product();
        pds1.setName("手铐");
        pds1.setId("2");
        pds1.setNum(20);
        pds1.setPrice(12.2f);

        Product pds2 = new Product("4", "沐浴露", 10, 50.2f, 0);
        Product pds3 = new Product("3", "taotao", 10, 20.2f, 0);

        manual.addProduc(pds);
        manual.addProduc(pds1);
        manual.addProduc(pds2);
        manual.addProduc(pds3);
    }
}
