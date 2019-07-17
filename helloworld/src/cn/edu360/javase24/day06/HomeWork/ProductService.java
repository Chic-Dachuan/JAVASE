package cn.edu360.javase24.day06.HomeWork;


import java.util.ArrayList;

public interface ProductService {
    // 添加商品到数据库
    public void addProduct(Products p);

    // 查询所有数据
    public ArrayList<Products> getAllProducts();

    // 根据id查商品
    public Products getProductBypId(String pid);

    // 根据name查商品
    public Products getProductBypName(String pname);

    // 根据价格区间查商品
    public ArrayList<Products> getProductByPriceRange(float minPrice, float maxPrice);

    // 删除商品
    public void removeProductByID(String pid);

    // 修改商品名称
    public void updateName(String pid, String newName);

    // 修改商品价格
    public void updatePrice(String pid, float newPrice);

    // 修改商品的库存
    public void updateStockNum(String pid, int newStockNum);
}
