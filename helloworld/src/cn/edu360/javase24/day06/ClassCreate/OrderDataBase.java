package cn.edu360.javase24.day06.ClassCreate;

/**
 * 首先执行静态代码块  包含静态成员  多份静态代码块 从上往下依次执行
 * 之后是普通代码块
 * 最后才是构造函数
 */

/**
 * 静态代码块，此类在被JVM加载的时候，就会被执行,不需要new
 * new 只是在执行构造函数
 */

public class OrderDataBase {
    /**
     * 静态成员
     */
    public static String orderVersion;

    /**
     * 普通代码块
     */
    {
     System.out.println("普通代码块执行了");
    }

    /**
     * 构造函数
     */
    public OrderDataBase(){
        System.out.println("空参构造函数....");
        System.out.println("构造函数 赋值前order版本是 " + orderVersion);
        orderVersion = "2000";
        System.out.println("构造函数 赋值后order版本是 " + orderVersion);
    }

    /**
     * 静态代码块
     */
    static {
        System.out.println("静态代码块执行了");
        System.out.println("静态代码 赋值前order版本是 " + orderVersion);
        orderVersion = "100";
        System.out.println("静态代码 赋值后order版本是 " + orderVersion);

    }
}
