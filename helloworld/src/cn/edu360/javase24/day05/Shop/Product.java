package cn.edu360.javase24.day05.Shop;

public class Product {
    private String id;
    private String name;
    private int num;
    private float price;
    private int payNum;
    public Product(){

    }
    public Product(String id, String name, int num, float price, int payNum){
        this.id = id;
        this.name = name;
        this.num = num;
        this.price = price;
        this.payNum = payNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getPayNum() {
        return payNum;
    }

    public void setPayNum(int payNum) {
        this.payNum = payNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void showProduct(){
        System.out.println(this.toString());
    }

    public String toString(){
        return this.id + "\n名字: " + this.name + "\n数量：" + this.num + "\n单价：" + this.price;
    }
}
