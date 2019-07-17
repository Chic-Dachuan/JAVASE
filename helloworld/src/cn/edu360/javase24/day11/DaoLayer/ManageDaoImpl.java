package cn.edu360.javase24.day11.DaoLayer;

import cn.edu360.javase24.day11.Bean.Pro;
import cn.edu360.javase24.day11.Constant.DataPath;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class ManageDaoImpl implements ManageDao {
    private DaoTool<Pro> daoTool;

    public ManageDaoImpl() {
        daoTool = new DaoTool<>();
    }

    @Override
    public List<Pro> getAllProducts() throws Exception {
        HashMap<String, Pro> pMap = daoTool.readMapFromFile(DataPath.PRODUCT_DATA_PATH);
        Collection<Pro> values = pMap.values();
        return new ArrayList<>(values);
        /**
         * 上面这句话等价于
         * ArrayList<Pro> pList = new ArrayList<>();
         *         for (Pro p: values
         *              ) {
         *             pList.add(p);
         *         }
         *         return pList;
         */
    }

    @Override
    public List<Pro> getProductsByCateName(String cateName) throws Exception {
        HashMap<String, Pro> pMap = daoTool.readMapFromFile(DataPath.PRODUCT_DATA_PATH);
        Collection<Pro> values = pMap.values();
        ArrayList<Pro> pList = new ArrayList<>();
        for (Pro p: values
             ) {
            if (p.getCategotytName().contains(cateName)){
                pList.add(p);
            }
        }
        return pList;
    }

    @Override
    public List<Pro> getProductsByPriceRange(float minPrice, float maxPrice) throws Exception {
        HashMap<String, Pro> pMap = daoTool.readMapFromFile(DataPath.PRODUCT_DATA_PATH);
        Collection<Pro> values = pMap.values();
        ArrayList<Pro> pList = new ArrayList<>();
        for (Pro p: values
        ) {
            if (p.getPrice()>= minPrice && p.getPrice() <= maxPrice){
                pList.add(p);
            }
        }
        return pList;
    }

    @Override
    public Pro getProductsBypId(String pId) throws Exception {
        HashMap<String, Pro> pMap = daoTool.readMapFromFile(DataPath.PRODUCT_DATA_PATH);
        return pMap.get(pId);
    }

    @Override
    public boolean addShopProduct(Pro pro) throws Exception {
        HashMap<String, Pro> pMap = daoTool.readMapFromFile(DataPath.PRODUCT_DATA_PATH);
        pMap.put(pro.getpId(), pro);

        /**
         * 将商品重新写入
         */
        daoTool.saveMapFile(pMap, DataPath.PRODUCT_DATA_PATH);
        return true;
    }

    @Override
    public boolean updateProduct(Pro pro) throws Exception {
        HashMap<String, Pro> pMap = daoTool.readMapFromFile(DataPath.PRODUCT_DATA_PATH);
        pMap.put(pro.getpId(), pro);

        /**
         * 将商品重新写入
         */
        daoTool.saveMapFile(pMap, DataPath.PRODUCT_DATA_PATH);
        return true;
    }
}
