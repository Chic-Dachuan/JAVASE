package cn.edu360.javase24.day06.HomeWork;

import org.junit.Test;

import java.util.ArrayList;

public class SystemTest {
    @Test
    public void testAdd(){
        ProductServiceImpl service = new ProductServiceImpl();
        Products p1 = new Products("1", "手环", 199.9f, 1000);
        service.addProduct(p1);
//        ArrayList<Products> productsArrayList = service.getAllProducts();
//        for (Products p: productsArrayList
//             ) {
//            System.out.println(p.toString());
//        }
        Products productsById = service.getProductBypId("2");
        System.out.println(productsById);
    }

    @Test
    public void testgetById(){
        ProductServiceImpl service = new ProductServiceImpl();
        Products p1 = new Products("1", "手环", 199.9f, 1000);
        service.addProduct(p1);
        Products productsById = service.getProductBypId("2");
        System.out.println(productsById);
    }

    @Test
    public void testgetByName(){
        ProductServiceImpl service = new ProductServiceImpl();
        Products p1 = new Products("1", "手环", 199.9f, 1000);
        service.addProduct(p1);
        Products productsById = service.getProductBypName("手环1");
        System.out.println(productsById);
    }

    @Test
    public void testgetByPriceRange(){
        ProductServiceImpl service = new ProductServiceImpl();

        Products p1 = new Products("1", "手1环", 99.9f, 1000);
        Products p2 = new Products("2", "手2环", 199.9f, 1000);
        Products p3 = new Products("3", "手3环", 299.9f, 1000);
        Products p4 = new Products("4", "手4环", 179.9f, 1000);
        Products p5 = new Products("5", "手5环", 1109.9f, 1000);

        service.addProduct(p1);
        service.addProduct(p2);
        service.addProduct(p3);
        service.addProduct(p4);
        service.addProduct(p5);

        ArrayList<Products> productsByPriceRange = service.getProductByPriceRange(100f, 300f);
        System.out.println(productsByPriceRange);
    }

    @Test
    public void testUpdate(){
        ProductServiceImpl service = new ProductServiceImpl();

        Products p1 = new Products("1", "手1环", 99.9f, 1000);
        Products p2 = new Products("2", "手2环", 199.9f, 1000);
        Products p3 = new Products("3", "手3环", 299.9f, 1000);
        Products p4 = new Products("4", "手4环", 179.9f, 1000);
        Products p5 = new Products("5", "手5环", 1109.9f, 1000);

        service.addProduct(p1);
        service.addProduct(p2);
        service.addProduct(p3);
        service.addProduct(p4);
        service.addProduct(p5);

        service.updateName("1", "魔戒");
        Products products = service.getProductBypId("1");
        System.out.println(products);
    }
}
