package cn.edu360.javase24.day06;

public interface UserManage {
    public boolean login(String name, String pwd);

    /**
     * 如果密码不一致，则返回1
     * 如果用户名已存在， 则返回2
     * 如果注册成功，则返回3
     * @param name
     * @param pwd1
     * @param pwd2
     * @return
     */
    public String regist(String name, String pwd1, String pwd2);
}
