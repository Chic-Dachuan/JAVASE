package cn.edu360.javase24.day13;

import org.junit.Test;

public class Test1 {
    @Test
    public void see(){

        ClassDemo classDemo = new ClassDemo();
        classDemo.name = "发哥";
        classDemo.say();

        ClassDemo classDemo1 = new ClassDemo();
        classDemo1.say();

        ClassDemo.see();

    }

}
