package cn.edu360.javase24.day14.reflect;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Properties;

public class reflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, IOException {
        LoginServerImpl login = new LoginServerImpl();
        login.eat();

        /**
         * 反射方式来构造对象
         */
        String type = "cn.edu360.javase24.day14.reflect.LoginServerImpl";
        String method = "say";

//        Class<?> class1 = type.getClass();
//        class1 = String.class;
//        try{
//            class1 = Class.forName("java.lang.String");
//        }catch (ClassNotFoundException e){
//            e.printStackTrace();
//        }
//        String xx = (String)class1.getDeclaredConstructor().newInstance();

        Class<?> forName = Class.forName(type);
        //noinspection deprecation
        Object instance = forName.newInstance();  // 得到类对象
        Method method1 = forName.getMethod(method, String.class);
        method1.invoke(instance, "林志玲");

        /**
         *
         */
        Properties prop = new Properties();
        /**
         * 加载文件
         */
        prop.load(new FileInputStream("./src/class.properties"));
        // 另一种获取方法
        //reflectDemo.class.getClassLoader().getResourceAsStream("class.properties")
        prop.load(Objects.requireNonNull(reflectDemo.class.getClassLoader().getResourceAsStream("class.properties")));
//        prop.put("type", "cn.edu360.javase24.day14.reflect.LoginServerImpl");
//        prop.put("func", "say");
//        prop.put("paramType", "java.lang.String");
        String type1 = prop.getProperty("type");
        System.out.println(type1);
        String func = prop.getProperty("func");
        System.out.println(func);
        String paramType = prop.getProperty("paramType");
        System.out.println(paramType);
    }
}
