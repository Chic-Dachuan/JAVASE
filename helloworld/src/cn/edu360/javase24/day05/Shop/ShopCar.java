package cn.edu360.javase24.day05.Shop;

import java.util.ArrayList;

public class ShopCar {
    private ArrayList<Product> Cart = new ArrayList<>();

    // 往购物车中添加商品
    public void addCart(Product pds){
        this.Cart.add(pds);
    }

    // 从购物车中移除商品

    // 打印购物车信息
    public void showInfo(){
        for (int j = 0; j < Cart.size(); ++j){
            System.out.println("商品：" + Cart.get(j).getName() + "\n购买数量：" + Cart.get(j).getPayNum() +
                    "\n单价：" + Cart.get(j).getPrice() + "\n总额：" +
                    (Cart.get(j).getPrice() * Cart.get(j).getPayNum()));
        }
    }

    // 修改购物车中的商品数量

    @Override
    public String toString() {
        return super.toString();
    }
}
