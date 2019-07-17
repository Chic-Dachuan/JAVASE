package cn.edu360.javase24.day14.ProxyDemo;

public class LoginServerImpl implements LoginServer{
    public void say(){
        System.out.println("你好");
    }
    public void say(String name){
        System.out.println("你好，" + name);
    }

    public void eat(String food){
        System.out.println("吃的是: " + food);
    }
    public String speak(String name){
        return "hello," + name;
    }
}
