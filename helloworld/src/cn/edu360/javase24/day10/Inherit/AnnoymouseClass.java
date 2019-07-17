package cn.edu360.javase24.day10.Inherit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AnnoymouseClass {
    public static void main(String[] args){
        Person p = new Person();
        Chinese p1 = new Chinese();
        Person p2 = new Person(){};  // 这句表示创建一个匿名类，这个类没有名字 { }是类实体 这个类继承了Person类
        /**
         * {} 表示一个匿名内部类的类体
         * 多态：用父类的变量来引用子类对象
         */
        Person p3 = new Person(){
            /**
             * 可以重写，也可以不重写
             */
            @Override
            public void say(){
                System.out.println("我是美国人");
            }
        };
        p3.say();

        /**
         * 对接口使用匿名内部类创建对象
         */
        ArrayList<Person> pList = new ArrayList<>();
        Collections.sort(pList, new Comparator<Person>(){
            /**
             * 必须重写
             * @param o1
             * @param o2
             * @return
             */
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() > o2.getAge()){
                    return 1;
                }
                if (o1.getAge() < o2.getAge()){
                    return -1;
                }
                return 0;
            }
        });
    }
}
