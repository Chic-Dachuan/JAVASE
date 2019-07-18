package cn.edu360.javase24.TreadDemo;

public class ProductDb2 {
    /**
     * 方法2
     * 静态属性  不再具体对象中  具体对象 也不能调用
     * 静态属性或者方法在类模板中
     * 下面这个就是 让类模板中的pd属性指向 一个具体的productdb对象
     */
    static ProductDb2 pd = new ProductDb2();
    private ProductDb2(){

    }
    public static ProductDb2 getProdcut(){
        return pd;
    }
}
