package cn.edu360.javase24.day10.Reflect;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
/**
 * 面向接口编程
 */
public class Test {
    public static void main(String[] args) throws Exception{
        HashMap<String, String> applicationContext = new HashMap<>();
        String path = "./src/cn/edu360/javase24/day10/Reflect/a.txt";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        String className;
        while ((className = bufferedReader.readLine()) != null){
            String[] spl = className.split(":");
            applicationContext.put(spl[0], spl[1]);
        }
        bufferedReader.close();
        Class<?> forName = Class.forName(applicationContext.get("Service"));
        Service newIn = (Service)forName.newInstance();
        newIn.say();
        /**
         * seeService的eat方法
         */
        Class<?> forName1 = Class.forName(applicationContext.get("seeService"));
        seeService newIn1 = (seeService)forName1.newInstance();
        newIn1.eat();

    }
}
