package cn.edu360.javase24.day09.ProductExample;

public class Productes {
    private String pid;
    private String pname;
    private float price;

    public Productes(String pid, String pname, float price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Productes{" +
                "pid='" + pid + '\'' +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                '}';
    }
}
