package cn.edu360.javase24.day11.Bean;

import java.io.Serializable;

public class Pro implements Serializable {
    private String  pId;
    private String pName;
    private float price;
    private int stockNum;
    private String categotytName;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Pro() {
    }

    public Pro(String pId, String pName, float price, int stockNum, String categotytName, String status) {
        this.pId = pId;
        this.pName = pName;
        this.price = price;
        this.stockNum = stockNum;
        this.categotytName = categotytName;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pro{" +
                "pId='" + pId + '\'' +
                ", pName='" + pName + '\'' +
                ", price=" + price +
                ", stockNum=" + stockNum +
                ", categotytName='" + categotytName + '\'' +
                ", status='" + status + '\'' +
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStockNum() {
        return stockNum;
    }

    public void setStockNum(int stockNum) {
        this.stockNum = stockNum;
    }

    public String getCategotytName() {
        return categotytName;
    }

    public void setCategotytName(String categotytName) {
        this.categotytName = categotytName;
    }
}
