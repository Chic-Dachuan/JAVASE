package cn.edu360.javase24.day10.Inherit;

public class Japanese extends AbstractPerson{
    /**
     * 子类中必须实现父类的抽象方法
     */
    @Override
    public void say() {
        System.out.println("丫咩嘚");
    }
    public static void main(String[] args){
        Japanese japan = new Japanese();
        japan.name = "梅川内酷";
        japan.eat();
        japan.age = 10;
        japan.say();
    }
}
