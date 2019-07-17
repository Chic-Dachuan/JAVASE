package cn.edu360.javase24.day11.DaoLayer;

import cn.edu360.javase24.day11.Bean.U;
import cn.edu360.javase24.day11.Constant.DataPath;

import java.util.*;

public class UserDaoImpl implements UserDao {
    private DaoTool<U> daoTool;

    public UserDaoImpl() {
        daoTool = new DaoTool<>();
    }

    @Override
    public boolean addUser(U u) throws Exception {
        /**
         * 读文件，获取所有文件数据
         * 然后添加
         * 最后全写入
         */
        HashMap<String, U> readObject = null;
        try {
            readObject = daoTool.readMapFromFile(DataPath.USER_DATA_PATH);
        } catch (Exception e) {
            readObject = new HashMap<>();
        }
        readObject.put(u.getAccount(), u);

        daoTool.saveMapFile(readObject, DataPath.USER_DATA_PATH);
        return true;
    }

    @Override
    public boolean removeUser(String account) throws Exception {
        HashMap<String, U> readObject = daoTool.readMapFromFile(DataPath.USER_DATA_PATH);

        U u = readObject.remove(account);

        daoTool.saveMapFile(readObject, DataPath.USER_DATA_PATH);
        return u != null;
    }

    @Override
    public boolean updateUser(U u) throws Exception{
        HashMap<String, U> readObject = daoTool.readMapFromFile(DataPath.USER_DATA_PATH);

        U h = readObject.put(u.getAccount(), u);

        daoTool.saveMapFile(readObject, DataPath.USER_DATA_PATH);
        return h != null;
    }

    /**
     * 根据指定账号查询用户
     *
     * @param account
     * @return
     */
    @Override
    public U getuserByAccount(String account) throws Exception {
        HashMap<String, U> readObject = daoTool.readMapFromFile(DataPath.USER_DATA_PATH);
        return readObject.get(account);
    }

    @Override
    public List<U> getuserByAgeRange(int minage, int maxage) throws Exception{
        ArrayList<U> userList = new ArrayList<>();
        HashMap<String, U> readObject = daoTool.readMapFromFile(DataPath.USER_DATA_PATH);
        Collection<U> users = readObject.values();
        for (U u: users
             ) {
            if (u.getAge() >= minage && u.getAge() <= maxage){
                userList.add(u);
            }
        }
        return userList;
    }

    @Override
    public List<U> getuserByName(String name) throws Exception{
        ArrayList<U> userList = new ArrayList<>();
        HashMap<String, U> readObject = daoTool.readMapFromFile(DataPath.USER_DATA_PATH);
        Collection<U> users = readObject.values();
        for (U u: users
        ) {
            if (u.getName().contains(name)){
                userList.add(u);
            }
        }
        return userList;
    }
}
