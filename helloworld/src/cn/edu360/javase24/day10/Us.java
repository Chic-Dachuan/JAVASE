package cn.edu360.javase24.day10;

import java.io.Serializable;

public class Us implements Serializable {  // 加上Serializable 表示这个类可以序列化，
    // 方便ObjectOutputStream 写入文件
    private String name;
    private int age;
    private float price;
    private long hairNum;

    public Us() {
    }

    public Us(String name, int age, float price, long hairNum) {
        this.name = name;
        this.age = age;
        this.price = price;
        this.hairNum = hairNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public long getHairNum() {
        return hairNum;
    }

    public void setHairNum(long hairNum) {
        this.hairNum = hairNum;
    }

    @Override
    public String toString() {
        return "Us{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                ", hairNum=" + hairNum +
                '}';
    }
}
