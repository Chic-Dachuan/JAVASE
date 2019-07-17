package cn.edu360.javase24.day11.Bean;

import java.io.Serializable;

/**
 * 描述用户的实体类
 */
public class U implements Serializable {
    private String account;
    private String pwds;
    private String name;
    private int age;
    private int viplevel;
    private String phone;
    private String addr;

    public U() {

    }

    public U(String account, String pwds, String name, int age, int viplevel, String phone, String addr) {
        this.account = account;
        this.pwds = pwds;
        this.name = name;
        this.age = age;
        this.viplevel = viplevel;
        this.phone = phone;
        this.addr = addr;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwds() {
        return pwds;
    }

    public void setPwds(String pwds) {
        this.pwds = pwds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getViplevel() {
        return viplevel;
    }

    public void setViplevel(int viplevel) {
        this.viplevel = viplevel;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "U{" +
                "account='" + account + '\'' +
                ", pwds='" + pwds + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", viplevel='" + viplevel + '\'' +
                ", phone='" + phone + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
