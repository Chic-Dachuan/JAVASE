package cn.edu360.javase24.day11.DaoLayer;

import cn.edu360.javase24.day11.Bean.CarItem;
import cn.edu360.javase24.day11.Constant.DataPath;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class CarDaoImpl implements CarDao {
    DaoTool<HashMap<String, CarItem>> daoTool = new DaoTool<>();

    /**
     * 购物车数据库中已有该用户
     * @param userId
     * @param item
     * @return
     */
    @Override
    public boolean addItemToCar(String userId, CarItem item) {
        
        return false;
    }

    @Override
    public boolean addNewUserItemToCar(String userId, CarItem item) throws Exception {
        // 先从文件中加载出整个购物车hashmap
        File file = new File(DataPath.CAR_DATA_PATH);
        HashMap<String, HashMap<String, CarItem>> carMap = null;
        if (file.exists()){
            // 如果文件存在， 从文件中加载出hashmap
           carMap = daoTool.readMapFromFile(DataPath.CAR_DATA_PATH);
        }else{
            //如果该文件不存在 构造一个
            carMap = new HashMap<>();
        }
        HashMap<String, CarItem> userItems = new HashMap<>();
        userItems.put(item.getpId(), item);
        carMap.put(userId, userItems);

        daoTool.saveMapFile(carMap, DataPath.CAR_DATA_PATH);
        return true;
    }

    @Override
    public boolean removeItemFromCar(String userId, String pId) throws Exception {
        HashMap<String, HashMap<String, CarItem>> carMap = daoTool.readMapFromFile(DataPath.CAR_DATA_PATH);
        HashMap<String, CarItem> userItems = carMap.get(userId);
        return userItems.remove(pId) != null;
    }

    @Override
    public boolean updateItemBuyNum(String userId, String pId, int BuyNum) throws Exception {
        HashMap<String, HashMap<String, CarItem>> carMap = daoTool.readMapFromFile(DataPath.CAR_DATA_PATH);
        HashMap<String, CarItem> userItems = carMap.get(userId);
        CarItem carItem = userItems.get(pId);
        carItem.setBuyNum(BuyNum);
        return true;
    }

    @Override
    public List<CarItem> getAllItemsFromCar(String userId) throws Exception {
        HashMap<String, HashMap<String, CarItem>> carMap = daoTool.readMapFromFile(DataPath.CAR_DATA_PATH);
        HashMap<String, CarItem> userItems = carMap.get(userId);
        Collection<CarItem> values = userItems.values();
        return new ArrayList<>(values);
    }

    @Override
    public boolean checkIfuserExist(String userId) throws Exception {
        HashMap<String, HashMap<String, CarItem>> carMap = daoTool.readMapFromFile(DataPath.CAR_DATA_PATH);
        HashMap<String, CarItem> userItems = carMap.get(userId);
        return userItems != null;
    }

    @Override
    public boolean checkIfItemExist(String userId, String pId) throws Exception {
        HashMap<String, HashMap<String, CarItem>> carMap = daoTool.readMapFromFile(DataPath.CAR_DATA_PATH);
        HashMap<String, CarItem> userItems = carMap.get(userId);
        CarItem carItem =userItems.get(pId);
        return carItem != null;
    }

    @Override
    public CarItem getItemById(String userId, String pId) throws Exception {
        HashMap<String, HashMap<String, CarItem>> carMap = daoTool.readMapFromFile(DataPath.CAR_DATA_PATH);
        HashMap<String, CarItem> userItems = carMap.get(userId);
        return userItems.get(pId);
    }
}
