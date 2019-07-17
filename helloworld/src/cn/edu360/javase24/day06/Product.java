package cn.edu360.javase24.day06;

public class Product {
    private String name;
    private String pid;
    private float price;
    private int num;
    public Product(){

    }

    public Product(String name, String pid, float price, int num) {
        this.name = name;
        this.pid = pid;
        this.price = price;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
