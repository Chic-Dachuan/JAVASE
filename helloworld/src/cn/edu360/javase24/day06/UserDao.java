package cn.edu360.javase24.day06;

public interface UserDao {
    public User findUserByName(String userName);
    public boolean checkUserIfExist(String userName);
    public void addUser(User user);
}
