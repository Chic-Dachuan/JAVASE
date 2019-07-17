package cn.edu360.javase24.day06.HomeWork;

public class Products {
    private String id;
    private String pname;
    private float price;
    private int stockNum;

    public Products() {
    }

    public Products(String id, String pname, float price, int stockNum) {
        this.id = id;
        this.pname = pname;
        this.price = price;
        this.stockNum = stockNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
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

    @Override
    public String toString() {
        return "Products{" +
                "id='" + id + '\'' +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                ", stockNum=" + stockNum +
                '}';
    }
}
