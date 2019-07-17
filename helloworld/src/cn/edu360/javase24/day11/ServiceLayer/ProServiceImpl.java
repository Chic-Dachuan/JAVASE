package cn.edu360.javase24.day11.ServiceLayer;

import cn.edu360.javase24.day11.Bean.Pro;
import cn.edu360.javase24.day11.DaoLayer.ManageDao;
import cn.edu360.javase24.day11.DaoLayer.ManageDaoImpl;

import java.util.List;

public class ProServiceImpl implements ProService {
    private ManageDao manageDao;

    public ProServiceImpl() {
        manageDao = new ManageDaoImpl();
    }

    @Override
    public List<Pro> getAllProducts() throws Exception {
        return manageDao.getAllProducts();
    }

    @Override
    public List<Pro> getProductsByCateName(String cateName) throws Exception {
        return manageDao.getProductsByCateName(cateName);
    }

    @Override
    public List<Pro> getProductsByPriceRange(float minPrice, float maxPrice) throws Exception {
        return manageDao.getProductsByPriceRange(minPrice, maxPrice);
    }

    @Override
    public Pro getProductsBypId(String pId) throws Exception {
        return manageDao.getProductsBypId(pId);
    }

    /**
     * p01,香蕉，10.8，1000，水果，0
     * @param productInfo
     * @return
     * String  pId;
     *   String pName;
     *  float price;
     *   int stockNum;
     * String categotytName;
     *  String status;
     */
    @Override
    public boolean addShopProduct(String productInfo) throws Exception {
        String[] Info = productInfo.split(",");
        Pro pro = new Pro(Info[0], Info[1], Float.parseFloat(Info[2]),
                Integer.parseInt(Info[3]), Info[4], Info[5]);
        return manageDao.addShopProduct(pro);
    }

    @Override
    public boolean updateProductName(String pId, String newName) throws Exception {
        Pro pro = manageDao.getProductsBypId(pId);
        if (pro == null)
        {
            return false;
        }
        pro.setpName(newName);
        return manageDao.updateProduct(pro);
    }

    @Override
    public boolean updateProductPrice(String pId, float newPrice) throws Exception {
        Pro pro = manageDao.getProductsBypId(pId);
        if (pro == null)
        {
            return false;
        }
        pro.setPrice(newPrice);
        return manageDao.updateProduct(pro);
    }

    @Override
    public boolean updateProductStockNum(String pId, int newNum) throws Exception {
        Pro pro = manageDao.getProductsBypId(pId);
        if (pro == null)
        {
            return false;
        }
        pro.setStockNum(newNum);
        return manageDao.updateProduct(pro);
    }

    @Override
    public boolean updateProductStatus(String pId, String newStatus) throws Exception {
        Pro pro = manageDao.getProductsBypId(pId);
        if (pro == null)
        {
            return false;
        }
        pro.setStatus(newStatus);
        return manageDao.updateProduct(pro);
    }
}
