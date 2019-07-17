package cn.edu360.javase24.day04;

/**
 * 商品类
 */
public class Product {
    public String pId;  // 共有属性
    /**
     * 当类和需要调用该类的文件不在同一个包下，需要在属性前面加上public
     */
    public String  pname;
    public float price;
    public int number;

    public Product(){

    }
    public Product(String pId, String pname, float price, int number){
        this.pId = pId;
        this.pname = pname;
        this.price = price;
        this.number = number;
    }

    // 类方法
    // 公有方法
    public void pint(){
        System.out.println("商品：" + this.pname + "\n价格：" +
                this.price  + "\n数量：" + this.number);
    }

    public float amount(){

        return this.number * this.price;
    }

    // 带有参数的方法
    public void say(String name){
        System.out.println("I Miss You," + name + "!");
    }
    // 带参方法与不带参方法不冲突
    // 重名方法，但是参数列表不一样，叫方法的重载
    public void say(){
        System.out.println("I Miss You, 凤姐!");
    }
    // 带有参数 和 返回值
    public int qiuHe(int m, int k){
        return m + k;
    }
}
