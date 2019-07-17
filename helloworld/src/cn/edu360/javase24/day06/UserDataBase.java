package cn.edu360.javase24.day06;

import java.util.HashMap;

public class UserDataBase {
    public static HashMap<String, User> userMap = new HashMap<>();
    /**
     * 静态代码块
     */
    static {
        User u1 = new User("aaa", "123");
        User u2 = new User("bbb", "1234");
        userMap.put(u1.getUserName(), u1);
        userMap.put(u2.getUserName(), u2);
    }

}
