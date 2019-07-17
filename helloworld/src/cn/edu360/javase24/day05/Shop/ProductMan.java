package cn.edu360.javase24.day05.Shop;

import java.util.ArrayList;

/**
 * 1. 保存所有的商品数据
 * 2. 提供操作这些商品的方法
 */
public class ProductMan {
    ArrayList<Product> pds = new ArrayList<Product>();

    public void addProduc(Product p){
        this.pds.add(p);
    }

    public void showProducts(){
        for (int i = 0; i < pds.size(); ++i){
            System.out.println(pds.get(i).toString());
        }
    }

    public ArrayList<Product> getPds() {
        return pds;
    }

    public void setPds(ArrayList<Product> pds) {
        this.pds = pds;
    }
}
