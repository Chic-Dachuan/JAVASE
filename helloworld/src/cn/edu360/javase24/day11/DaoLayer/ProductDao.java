package cn.edu360.javase24.day11.DaoLayer;

import cn.edu360.javase24.day11.Bean.Pro;

import java.util.List;

public interface ProductDao {
    /**
     * 添加商品
     */
    public boolean addProduct(Pro pro) throws Exception;

    /**
     * 删除商品
     */
    public boolean removeProduct(String pId) throws Exception;

    /**
     * 修改商品
     */
    public boolean updateProduct(Pro pro) throws Exception;

    /**
     * 根据id查询商品
     */
    public Pro getProductBypId(String pId) throws Exception;

    /**
     * 根据名字查询商品
     */
    public List<Pro> getProductBypName(String pName) throws Exception;

    /**
     * 根据价格范围查询
     */
    public List<Pro> getProductByPriceRange(float minPrice, float maxPrice) throws Exception;

    /**
     * 根据类别查询商品
     */
    public List<Pro> getProductByCategory(String cateGory) throws Exception;
}
