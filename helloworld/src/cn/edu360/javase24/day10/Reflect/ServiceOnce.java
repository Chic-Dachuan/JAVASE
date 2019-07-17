package cn.edu360.javase24.day10.Reflect;

public class ServiceOnce implements Service{
    @Override
    public void say() {
        System.out.println("ServiceOne");
    }
}
