package cn.edu360.javase24.day11.DaoLayer;

import cn.edu360.javase24.day11.Bean.CarItem;

import java.util.List;

public interface CarDao {
    // 用户已存在
    public boolean addItemToCar(String userId, CarItem item);
    // 用户不存在
    public boolean addNewUserItemToCar(String userId, CarItem item) throws Exception;

    public boolean removeItemFromCar(String userId, String pId) throws Exception;

    public boolean updateItemBuyNum(String userId, String pId, int BuyNum) throws Exception;

    public List<CarItem> getAllItemsFromCar(String userId) throws Exception;

    // 判断数据库是否存在某个人的购物车
    public boolean checkIfuserExist(String userId) throws Exception;

    // 判断某个人中是否存在某个商品
    public boolean checkIfItemExist(String userId, String pId) throws Exception;

    // 根据指定的userId 和Pid 取出购物项
    public CarItem getItemById(String userId, String pId) throws Exception;

}
