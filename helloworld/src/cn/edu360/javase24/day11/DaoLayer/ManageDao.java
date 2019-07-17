package cn.edu360.javase24.day11.DaoLayer;

import cn.edu360.javase24.day11.Bean.Pro;

import java.util.List;

public interface ManageDao {
    /**
     * 查询所有商品
     */
    public List<Pro> getAllProducts() throws Exception;

    /**
     * 按类别查询商品
     */
    public List<Pro> getProductsByCateName(String cateName) throws Exception;

    /**
     * 按照价格范围查询
     */
    public List<Pro> getProductsByPriceRange(float minPrice, float maxPrice) throws Exception;

    /**
     * 根据id查询
     */
    public Pro getProductsBypId(String pId) throws Exception;

    /**
     * 添加商品
     */
    public boolean addShopProduct(Pro pro) throws Exception;

    /**
     * 更新商品
     */
    public boolean updateProduct(Pro pro) throws Exception;
}
