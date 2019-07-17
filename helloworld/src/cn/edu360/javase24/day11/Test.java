package cn.edu360.javase24.day11;

import cn.edu360.javase24.day11.reflect.Person;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception {
        String classname = "cn.edu360.javase24.day11.reflect.Person";
        String methodName = "eat";
        Class<?> forName = Class.forName(classname);
        Person p = (Person) forName.newInstance();
        /**
         * 从forName这个class模板中获取指定的方法
         */
        /**
         * 不需要传参
         */
        Method method = forName.getMethod(methodName);  // 这样就拿到模板中的方法
        String methodName1 = "makeFriend";
        String methodName2 = "adds";
        /**
         * 需要传递参数
         * 如果这个方法需要一个int参数类型 应该在第二个参数输入 Integer.class
         * 下面调用adds(Integer A, Integer B);
         */
        Method method1 = forName.getMethod(methodName1, String.class);
        Method method2 = forName.getMethod(methodName2, Integer.class, Integer.class);
        /**
         * 调用方法 === 将method在对象上执行
         */
        /**
         * 不要参数
         */
        Object invok = method.invoke(p);
        System.out.println(invok);
        /**
         * 传参
         */
        Object invok2 = method2.invoke(p, 1, 2);
        System.out.println(invok2);
        Object invok1 = method1.invoke(p, "林志玲");
        System.out.println(invok1);
    }
}
