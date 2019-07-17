package cn.edu360.javase24.day11.TestShop;

import cn.edu360.javase24.day11.Bean.U;
import cn.edu360.javase24.day11.Constant.UserVipConstant;
import cn.edu360.javase24.day11.DaoLayer.UserDaoImpl;
import org.junit.Test;

public class UserDaoTest {
    /**
     * 返回值必须是void
     */
    @Test
    public void testAddUser() throws Exception {
        U u1 = new U("菜鸡",  "123", "凤姐", 18, UserVipConstant.VIP_1, "13838388383", "北京");

        UserDaoImpl userDao = new UserDaoImpl();
        userDao.addUser(u1);

        U s = userDao.getuserByAccount("菜鸡");
        System.out.println(s);
    }
}
