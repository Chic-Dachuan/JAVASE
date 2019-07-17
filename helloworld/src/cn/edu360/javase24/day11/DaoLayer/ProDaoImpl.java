package cn.edu360.javase24.day11.DaoLayer;

import cn.edu360.javase24.day11.Bean.Pro;
import cn.edu360.javase24.day11.Constant.DataPath;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class ProDaoImpl implements ProductDao {
    private DaoTool<Pro> daoTool;

    public ProDaoImpl(){
        daoTool = new DaoTool<>();
    }

    @Override
    public boolean addProduct(Pro pro) throws Exception {
        File file = new File(DataPath.PRODUCT_DATA_PATH);
        HashMap<String, Pro> pMap = null;
        if(file.exists()){
            pMap = daoTool.readMapFromFile(DataPath.PRODUCT_DATA_PATH);
        }else {
            pMap = new HashMap<>();
        }
        pMap.put(pro.getpId(), pro);

        daoTool.saveMapFile(pMap, DataPath.PRODUCT_DATA_PATH);
        return true;
    }

    @Override
    public boolean removeProduct(String pId) throws Exception {
        HashMap<String, Pro> pMap = daoTool.readMapFromFile(DataPath.PRODUCT_DATA_PATH);
        pMap.remove(pId);
        daoTool.saveMapFile(pMap, DataPath.PRODUCT_DATA_PATH);
        return true;
    }

    @Override
    public boolean updateProduct(Pro pro) throws Exception {
        HashMap<String, Pro> pMap = daoTool.readMapFromFile(DataPath.PRODUCT_DATA_PATH);
        pMap.put(pro.getpId(), pro);
        daoTool.saveMapFile(pMap, DataPath.PRODUCT_DATA_PATH);
        return true;
    }

    @Override
    public Pro getProductBypId(String pId) throws Exception {
        HashMap<String, Pro> pMap = daoTool.readMapFromFile(DataPath.PRODUCT_DATA_PATH);
        return pMap.get(pId);
    }

    @Override
    public List<Pro> getProductBypName(String pName) throws Exception {
        ArrayList<Pro> pList = new ArrayList<>();
        HashMap<String, Pro> pMap = daoTool.readMapFromFile(DataPath.PRODUCT_DATA_PATH);
        Collection<Pro> pros = pMap.values();
        for (Pro p: pros
             ) {
            if (p.getpName().equals(pName)){
                pList.add(p);
            }
        }
        return pList;
    }

    @Override
    public List<Pro> getProductByPriceRange(float minPrice, float maxPrice) throws Exception {
        ArrayList<Pro> pList = new ArrayList<>();
        HashMap<String, Pro> pMap = daoTool.readMapFromFile(DataPath.PRODUCT_DATA_PATH);
        Collection<Pro> pros = pMap.values();
        for (Pro p: pros
        ) {
            if (p.getPrice() >= minPrice && p.getPrice() <= maxPrice){
                pList.add(p);
            }
        }
        return pList;
    }

    @Override
    public List<Pro> getProductByCategory(String cateGory) throws Exception {
        ArrayList<Pro> pList = new ArrayList<>();
        HashMap<String, Pro> pMap = daoTool.readMapFromFile(DataPath.PRODUCT_DATA_PATH);
        Collection<Pro> pros = pMap.values();
        for (Pro p: pros
        ) {
            if (p.getCategotytName().equals(cateGory)){
                pList.add(p);
            }
        }
        return pList;
    }
}
