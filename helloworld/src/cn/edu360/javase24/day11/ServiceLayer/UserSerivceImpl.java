package cn.edu360.javase24.day11.ServiceLayer;

import cn.edu360.javase24.day11.Bean.U;
import cn.edu360.javase24.day11.DaoLayer.UserDao;
import cn.edu360.javase24.day11.DaoLayer.UserDaoImpl;

public class UserSerivceImpl implements UserService {
    private UserDao userDao;

    public UserSerivceImpl() {
        userDao = new UserDaoImpl();
    }

    @Override
    public boolean checkIfAccountExist(String Account) throws Exception {
        return userDao.getuserByAccount(Account) != null;
    }

    @Override
    public boolean addUser(U u) throws Exception {
        return userDao.addUser(u);
    }

    @Override
    public boolean userLogin(String account, String pwds) throws Exception {
        U u = userDao.getuserByAccount(account);
        if (u == null){
            return false;
        }else {
            return u.getPwds().equals(pwds);
        }
    }

    @Override
    public boolean updateUserName(String Account, String newName) throws Exception {
        U u = userDao.getuserByAccount(Account);
        if (u == null){
            return false;
        }else {
            u.setName(newName);
            return userDao.updateUser(u);
        }
    }

    @Override
    public boolean updateUserAge(String Account, int age) throws Exception {
        U u = userDao.getuserByAccount(Account);
        if (u == null){
            return false;
        }else {
            u.setAge(age);
            return userDao.updateUser(u);
        }
    }

    @Override
    public boolean remove(String Account) throws Exception {
        return userDao.removeUser(Account);
    }
}
