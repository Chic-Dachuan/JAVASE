package cn.edu360.javase24.day06;

public class UserManageImpl implements UserManage {
    UserDao userDao = new UserDaoImpl();
    @Override
    public boolean login(String name, String pwd) {
        // 调用DAO层查询接口  查询用户是否存在  传入一个用户名 返回一个用户对象

        User user = userDao.findUserByName(name);
        if (user == null)
        {
            return false;
        }
        if (user.getPwd().equals(pwd)) {
            return true;
        }
        return false;
    }

    @Override
    public String regist(String name, String pwd1, String pwd2) {
        // 首先检查两个密码是否一致
        if (!pwd1.equals(pwd2)) {
            return "1";
        }
        // 调用DAO层的功能判断用户是否存在
        boolean ifExist = userDao.checkUserIfExist(name);

        // 如果用户名已存在,则返回2
        if (ifExist) {
            return "2";
        }
        // 将用户的信息存储到数据库中
        User U = new User(name, pwd1);
        userDao.addUser(U);
        return "3";
    }
}
