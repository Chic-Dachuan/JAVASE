package cn.edu360.javase24.day11.reflect;

public class Person {
    public void say(){
        System.out.println("说话了。。。");
    }
    public void eat(){
        System.out.println("吃饭了。。。");
    }
    public void makeFriend(String name){
        System.out.println("我有女票啦，名字是" + name);
    }
    public int adds(Integer a, Integer b){
        return a + b;
    }
}
