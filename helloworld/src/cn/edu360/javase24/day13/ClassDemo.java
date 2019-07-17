package cn.edu360.javase24.day13;

public class ClassDemo {
    /**
     * 这不是类属性  创建的每一个对象，这些对象都有独立的name属性
     */
    String name; // default属性不能跨包调
    public void say(){
        System.out.println(this.name);
    }
    /**
     * 静态方法不属于具体对象，属于类
     * static 修饰的方法和属性  属于类方法和类属性  对象不能调用
     * 类方法也不能直接调用对象方法和属性
     * 可以通过new一个具体对象出来调用
     */
    public static int age;
    public static void see(){
        System.out.println("See you again!");

         // System.out.println(this.name);
        /**
         * 不能调用对象属性  this.name  this表示一个具体的对象
         */
    }
}
