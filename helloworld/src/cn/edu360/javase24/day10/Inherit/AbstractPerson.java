package cn.edu360.javase24.day10.Inherit;

/**
 * abstract 修饰符 表示这个类是一个抽象的方法
 * 抽象方法与普通方法的区别：抽像方法只有方法定义没有方法体
 * 接口中只能有抽象方法，所以接口中方法全是抽象方法，abstract省略不写
 * 类中既可以有普通方法，又可以有抽象方法
 */
public abstract class AbstractPerson {
    public String name;
    public int age;

    /**
     * 声明这个方法是一个抽线的方法
     */
    public abstract void say();
    public void eat(){
        System.out.println("eating");
    }
}
