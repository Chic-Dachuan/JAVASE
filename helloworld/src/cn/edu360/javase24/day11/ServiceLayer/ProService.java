package cn.edu360.javase24.day11.ServiceLayer;

import cn.edu360.javase24.day11.Bean.Pro;

import java.util.List;

public interface ProService {
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
    public boolean addShopProduct(String productInfo) throws Exception;

    /**
     * 修改商品名称
     */
    public boolean updateProductName(String pId, String newName) throws Exception;

    /**
     * 修改商品价格
     */
    public boolean updateProductPrice(String pId, float newPrice) throws Exception;
    /**
     * 修改商品库存数量
     */
    public boolean updateProductStockNum(String pId, int newNum) throws Exception;
    /**
     * 修改商品状态
     * 0:上架
     * 1：下架
     * 3：删除
     */
    public boolean updateProductStatus(String pId, String newStatus) throws Exception;
}
