package cn.edu360.javase24.day06;

import org.junit.Test;

/**
 * 测试框架 junit
 * 它可以帮我们调用各种测试方法
 * 不需要写main方法来做测试
 */

public class UserDaoImplTest {
    @Test
    public void testAdd(){


    }
    @Test
    public void testFind(){
        UserDaoImpl userDao = new UserDaoImpl();
        User u = new User("zhangsan", "123");
        UserDataBase.userMap.put(u.getUserName(), u);
        User xx = userDao.findUserByName("zhangsan");
        System.out.println(xx.getPwd());
    }
}
