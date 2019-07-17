package cn.edu360.javase24.day10.Inherit;

public class Person {
    public String name;
    public int age;
    float price;  // default属性跨包就能继承

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

    public void say(){
        System.out.println("xx");
    }
    public void eat(){
        System.out.println("掐饭");
    }
}
