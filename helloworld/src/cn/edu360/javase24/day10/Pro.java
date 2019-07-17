package cn.edu360.javase24.day10;

import java.io.Serializable;

public class Pro implements Serializable {
    private String pname;
    private String pid;
    private int pnum;
    private float price;

    public Pro() {
    }

    public Pro(String pname, String pid, int pnum, float price) {
        this.pname = pname;
        this.pid = pid;
        this.pnum = pnum;
        this.price = price;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public int getPnum() {
        return pnum;
    }

    public void setPnum(int pnum) {
        this.pnum = pnum;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pro{" +
                "pname='" + pname + '\'' +
                ", pid='" + pid + '\'' +
                ", pnum=" + pnum +
                ", price=" + price +
                '}';
    }
}
