package cn.edu360.javase24.day11.Bean;

import java.io.Serializable;

public class CarItem implements Serializable {
    /**
     * 描述购物车中的商品信息
     */
    private String pId;
    private String pName;
    private float price;
    private int BuyNum;

    public CarItem() {
    }

    public CarItem(String pId, String pName, float price, int buyNum) {
        this.pId = pId;
        this.pName = pName;
        this.price = price;
        BuyNum = buyNum;
    }

    @Override
    public String toString() {
        return "CarItem{" +
                "pId='" + pId + '\'' +
                ", pName='" + pName + '\'' +
                ", price=" + price +
                ", BuyNum=" + BuyNum +
                '}';
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getBuyNum() {
        return BuyNum;
    }

    public void setBuyNum(int buyNum) {
        BuyNum = buyNum;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
