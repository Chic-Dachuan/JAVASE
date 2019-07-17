package cn.edu360.javase24.day11.ServiceLayer;

import cn.edu360.javase24.day11.Bean.CarItem;
import cn.edu360.javase24.day11.Bean.Pro;
import cn.edu360.javase24.day11.DaoLayer.CarDao;
import cn.edu360.javase24.day11.DaoLayer.ProDaoImpl;
import cn.edu360.javase24.day11.DaoLayer.ProductDao;

import java.util.List;

public class CarServiceImpl implements CarService {
    private CarDao carDao;
    private ProductDao productDao;

    public CarServiceImpl() {
        carDao = null;
        productDao = new ProDaoImpl();
    }

    @Override
    public boolean addItemToCar(String userId, String pId, int BuyNum) throws Exception {
        //先判断购物车数据是否存在该用户
        boolean b = carDao.checkIfuserExist(userId);
        // 如果已存在该用户
        if (b){
            // 再判断该商品是否存在
            boolean b1 = carDao.checkIfItemExist(userId, pId);
            if (b1){
                // 先取出已有的购物项
                CarItem item = carDao.getItemById(userId, pId);
                return carDao.updateItemBuyNum(userId, pId, BuyNum + item.getBuyNum());
            }else{
                // 先根据pId从商品管理模块dao中获取商品信息
                Pro pro = productDao.getProductBypId(pId);

                // 然后构造购物项实体
                CarItem item = new CarItem(userId, pro.getpName(), pro.getPrice(), BuyNum);

                // 再利用购物车dao将这个购物项添加到用户已有的购物车数据表中
                return carDao.addItemToCar(userId, item);
            }
        }else{
            // 如果该用户不存在

            // 先根据pId从商品管理模块dao中获取商品信息
            Pro pro = productDao.getProductBypId(pId);

            // 然后构造购物项实体
            CarItem item = new CarItem(userId, pro.getpName(), pro.getPrice(), BuyNum);

            // 再利用购物车dao将这个购物项新增到购物车数据表中
            return carDao.addNewUserItemToCar(userId, item);
        }

    }

    @Override
    public boolean removeItemFromCar(String userId, String pId) throws Exception {
        return carDao.removeItemFromCar(userId, pId);
    }

    @Override
    public boolean updateItemBuyNum(String userId, String pId, int BuyNum) throws Exception {
        return carDao.updateItemBuyNum(userId, pId, BuyNum);
    }

    @Override
    public List<CarItem> getAllItem(String userId) throws Exception {
        return carDao.getAllItemsFromCar(userId);
    }
}
