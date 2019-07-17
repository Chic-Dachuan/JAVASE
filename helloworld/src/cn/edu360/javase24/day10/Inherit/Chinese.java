package cn.edu360.javase24.day10.Inherit;

public class Chinese extends Person{
    public void KillJapanese(){
        System.out.println("杀");
    }

    @Override
    public void say() {
        System.out.println("我日你大爷");
    }
}
