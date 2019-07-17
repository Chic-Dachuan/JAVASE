package cn.edu360.javase24.day04;

/**
 * 用户类
 */
public class User {
    public String userid;
    public String name;
    public String viplevel;
    // 构造方法
    public User(){

    }
    public User(String userid, String name, String viplevel){
        this.userid = userid;
        this.name = name;
        this.viplevel = viplevel;
    }
}
