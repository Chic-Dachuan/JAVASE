package cn.edu360.javase24.day10.Inherit;

public class ExtendTest {
    public static void main(String[] args){
        /**
         * 父类型的变量可以引用子类型的对象
         * Person usa = new American();  没有错 但是不能调用子类特有的方法和属性
         */
        American usa = new American();
        usa.age = 10;
        usa.name = "Jobs";
        usa.price = 10.0f;
        usa.hairColor = "屎黄";
        usa.shualai();
        usa.say();
        Chinese chinese =  new Chinese();
        chinese.say();
    }
}
