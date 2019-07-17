package cn.edu360.javase24.day11.DaoLayer;

import cn.edu360.javase24.day11.Bean.U;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface UserDao {
    /**
     * 增加用户
     */

    public boolean addUser(U u) throws Exception;
    /**
     * 移除用户
     */

    public boolean removeUser(String account) throws IOException, Exception;

    /**
     * 修改用户
     * 要求service层把要修改的用户的所有数据全传过来
     */
    public boolean updateUser(U u) throws Exception;

    /**
     * 查找
     * @param account
     * @return
     */
    public U getuserByAccount(String account) throws Exception;

    /**
     * 根据范围查找
     * @param minage
     * @param maxage
     * @return
     */
    public List<U> getuserByAgeRange(int minage, int maxage) throws Exception;

    /**
     * 根据姓名查用户
     */
    public List<U> getuserByName(String name) throws Exception;

}
