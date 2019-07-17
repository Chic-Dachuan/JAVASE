package cn.edu360.javase24.day06;

public class UserDaoImpl implements UserDao {

    @Override
    public User findUserByName(String userName) {
        return UserDataBase.userMap.get(userName);
    }

    @Override
    /**
     * 检查数据库中是否存在该用户名
     */
    public boolean checkUserIfExist(String userName) {
        return UserDataBase.userMap.containsKey(userName);
    }

    @Override
    public void addUser(User user) {
        UserDataBase.userMap.put(user.getUserName(), user);
    }
}
