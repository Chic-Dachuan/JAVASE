package cn.edu360.javase24.day11.ServiceLayer;

import cn.edu360.javase24.day11.Bean.CarItem;

import java.util.List;

public interface CarService {
    /**
     * 增加商品到购物车
     */
    public boolean addItemToCar(String userId, String pId, int BuyNum) throws Exception;
    /**
     *删除购物车商品
     */
    public boolean removeItemFromCar(String userId, String pId) throws Exception;

    /**
     * 修改
     */
    public boolean updateItemBuyNum(String userId, String pId, int BuyNum) throws Exception;

    /**
     * 查
     */
    public List<CarItem> getAllItem(String userId) throws Exception;
}
