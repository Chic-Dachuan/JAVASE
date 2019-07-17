package cn.edu360.javase24.day10.Inherit;

/**
 * 用extends 关键字来对父类继承
 * 父类的private 不能被子类继承
 * default属性跨包就能继承  就是类中 属性或者方法前面 没有类似public修饰
 */
public class American extends Person {
    public String hairColor;
    public void shualai(){
        System.out.println("我就耍赖，你咬我呀！");
    }
    /**
     * 子类对父类方法重写
     * 父类有这个方法
     * 子类重写该方法，就会覆盖父类方法
     */
    @Override
    public void say(){
        System.out.println("Hello");
    }
}
