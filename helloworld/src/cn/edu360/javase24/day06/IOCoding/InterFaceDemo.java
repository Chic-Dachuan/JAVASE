package cn.edu360.javase24.day06.IOCoding;

import java.util.HashMap;

public class InterFaceDemo {
    public static void main(String [] args){
        XXService xxService = new XXServiceImpl();
        // 接收到客户端的输入1 就要调用业务中的setp1
        String s1 = xxService.step1();
        System.out.println(s1);
        // 接收到客户端的输入2 就要调用业务中的setp3
        int num = xxService.step2();
        System.out.println(num);
        // 接收到客户端的输入3 就要调用业务中的setp3
        HashMap<Integer, String> hashMap = xxService.step3("c");
        System.out.println(hashMap.get(1));
        // ((XXServiceImpl) xxService).shwo();
    }

}
