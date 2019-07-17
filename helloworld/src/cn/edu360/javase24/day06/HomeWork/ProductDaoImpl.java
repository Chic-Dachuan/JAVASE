package cn.edu360.javase24.day06.HomeWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ProductDaoImpl implements ProductDao {
    /**
     * 添加一个商品到数据库
     * @param p
     */
    @Override
    public void addProduct(Products p) {
        ProductData.pMap.put(p.getId(), p);
    }

    @Override
    public Set<Products> getAllProducts() {
        Collection<Products> value = ProductData.pMap.values();
        HashSet<Products> pSet = new HashSet<>();
        for (Products p: value){
            pSet.add(p);
        }
        return pSet;
    }

    @Override
    public Products getProductBypId(String pid) {
        return ProductData.pMap.get(pid);
    }

    @Override
    public Products getProductBypName(String pname) {
        Collection<Products> value = ProductData.pMap.values();
        for (Products p: value){
            if (p.getPname().equals(pname)){
                return p;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Products> getProductByPriceRange(float minPrice, float maxPrice) {
        ArrayList<Products> pList = new ArrayList<>();
        Collection<Products> value = ProductData.pMap.values();
        for (Products p: value){
            if (p.getPrice() >= minPrice && p.getPrice() <= maxPrice){
                pList.add(p);
            }
        }
        return pList;
    }

    @Override
    public void removeProductByID(String pid) {
        ProductData.pMap.remove(pid);
    }

    @Override
    public void updateProduct(Products p) {
        ProductData.pMap.put(p.getId(), p);
    }
}
