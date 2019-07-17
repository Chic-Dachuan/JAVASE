package cn.edu360.javase24.day06.IOCoding;

import java.util.HashMap;

public class XXServiceImpl implements XXService {

    @Override
    public String step1() {
        return "step1";
    }

    @Override
    public int step2() {
        return 666;
    }

    @Override
    public HashMap<Integer, String> step3(String a) {
        HashMap<Integer, String> step = new HashMap<>();
        step.put(1, a);
        return step;
    }

    /**
     * interface中没有定义的方法 在具体实现类中也可以写额外的方法
     */
    public void shwo(){
        System.out.println("Welcome to China!");
    }
}
