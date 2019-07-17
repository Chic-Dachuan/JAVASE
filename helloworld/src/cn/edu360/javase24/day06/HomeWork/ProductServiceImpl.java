package cn.edu360.javase24.day06.HomeWork;

import java.util.ArrayList;
import java.util.Set;

public class ProductServiceImpl implements ProductService {
    private ProductDao productDao = new ProductDaoImpl();
    @Override
    public void addProduct(Products p) {
        productDao.addProduct(p);
    }

    @Override
    public ArrayList<Products> getAllProducts() {
        Set<Products> set =  productDao.getAllProducts();
        ArrayList<Products> pList = new ArrayList<>();
        for (Products p: set
             ) {
            pList.add(p);
        }
        return pList;
    }

    @Override
    public Products getProductBypId(String pid) {
        return productDao.getProductBypId(pid);
    }

    @Override
    public Products getProductBypName(String pname) {
        return productDao.getProductBypName(pname);
    }

    @Override
    public ArrayList<Products> getProductByPriceRange(float minPrice, float maxPrice) {
        return productDao.getProductByPriceRange(minPrice, maxPrice);
    }

    @Override
    public void removeProductByID(String pid) {
        productDao.removeProductByID(pid);
    }

    @Override
    public void updateName(String pid, String newName) {
        Products oldP;
        oldP = productDao.getProductBypId(pid);
        // productDao.removeProductByID(pid);
       //  System.out.println(oldP);
        oldP.setPname(newName);
        productDao.updateProduct(oldP);
    }

    @Override
    public void updatePrice(String pid, float newPrice) {
        Products oldP = productDao.getProductBypId(pid);
        oldP.setPrice(newPrice);
        productDao.updateProduct(oldP);
    }

    @Override
    public void updateStockNum(String pid, int newStockNum) {
        Products oldP = productDao.getProductBypId(pid);
        oldP.setStockNum(newStockNum);
        productDao.updateProduct(oldP);
    }
}
