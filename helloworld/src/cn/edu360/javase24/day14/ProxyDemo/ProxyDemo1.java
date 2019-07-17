package cn.edu360.javase24.day14.ProxyDemo;

import java.lang.reflect.Proxy;

public class ProxyDemo1 {
    public static void main(String[] args){
        /**
         * 构造一个loginserver的动态代理对象
         * 参数1：加载类的接口对象
         * 参数2：代理的类名，可以是多个，是一个Class[]类型数组
         */
        LoginServer o = (LoginServer) Proxy.newProxyInstance(LoginServer.class.getClassLoader(),
                new Class<?>[]{LoginServer.class}, new myInvocationHandler() // {
            /**
             * InvocationHandler
             * 必须实现InvocationHandler（） 类的invoke方法
             * @param proxy
             * @param method
             * @param args
             * @return
             * @throws Throwable
             */
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//
//
        //}
        );  // 构造动态代理的对象
        /**
         * 然后调用动态代理上的方法
         * 这些方法一定是接口中已经定义的方法
         * 但是这些方法的逻辑并不是LoginServeImpl实现的逻辑  而是在myInvocationHandler的invoke方法中实现的逻辑
         */
        o.eat("Sandwich");
       System.out.println( o.speak("haha"));
    }
}
