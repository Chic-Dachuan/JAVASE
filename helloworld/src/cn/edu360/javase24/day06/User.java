package cn.edu360.javase24.day06;

public class User {
    private String userName;
    private String Pwd;

    public User(String userName, String pwd) {
        this.userName = userName;
        this.Pwd = pwd;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return this.Pwd;
    }

    public void setPwd(String pwd) {
        this.Pwd = pwd;
    }
}
