package cn.edu360.javase24.day04;

import java.util.ArrayList;

/**
 * 订单类
 */
public class Order {
    // 订单id
    public String oId;
    // 订单所属对象
    public User user;
    // 订单包含商品
    public ArrayList<Product> pds;
    // 订单总金额
    public float amount;
    public float topay;

    public void setToamount(){
        for (int i = 0; i < this.pds.size(); ++i){
            this.amount += this.pds.get(i).price * this.pds.get(i).number;
        }
    }

    public void setTopay(){
        if (this.amount >= 1000 && this.amount < 2000){
            this.topay = this.amount * 0.98f;
        }
        if(this.amount >= 2000 && this.amount < 3000){
            this.topay = this.amount * 0.95f;
        }
        if(this.amount >= 3000)
        {
            this.topay = this.amount * 0.90f;
        }
        if (this.amount < 1000){
            this.topay = this.amount;
        }
        this.onSale();
    }

    private void onSale(){
        if (this.user.viplevel.equals("黄金VIP")){
            this.topay = this.topay * 0.98f;
        }
        if (this.user.viplevel.equals("砖石VIP")){
            this.topay = this.topay * 0.95f;
        }
        if (this.user.viplevel.equals("至尊VIP")){
            this.topay = this.topay * 0.89f;
        }
    }
}
