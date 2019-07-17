package cn.edu360.javase24.day11.ServiceLayer;

import cn.edu360.javase24.day11.Bean.U;

public interface UserService {
    /**
     * 检查用户是否存在
     */
    public boolean checkIfAccountExist(String Account) throws Exception;
    /**
     * 增加用户
     */
    public boolean addUser(U u) throws Exception;

    /**
     * 登录
     */
    public boolean userLogin(String account, String pwds) throws Exception;

    /**
     * 更新
     */
    public boolean updateUserName(String Account, String newName) throws Exception;

    public boolean updateUserAge(String Account, int age) throws Exception;

    public boolean remove(String Account) throws Exception;
}
