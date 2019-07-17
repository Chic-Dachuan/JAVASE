package cn.edu360.javase24.day14.ProxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class myInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("eat")){
            /**
             * 修改原有的逻辑
             */
            System.out.println("我一点不喜欢吃" + args[0]);
        }
        if (method.getName().equals("speak")){
            /**
             * 直接调用原有逻辑
             */
            return new LoginServerImpl().speak((String)args[0]);
        }
        if (method.getName().equals("say")){
            if (method.getParameterTypes().length > 0){

            }else {

            }
        }
        return null;
    }

}
