package cn.edu360.javase24.day02;

public class BuyShow {
    public static void main(String[] args){
        Goods[] goodsArr = new Goods[4];
        Goods xx = new Goods();
        xx.id = "sex1";
        xx.name = "皮鞭";
        xx.category = "情趣用品";
        xx.price = 100f;
        Goods yy = new Goods();
        yy.id = "sex2";
        yy.name = "蜡烛";
        yy.category = "情趣用品";
        yy.price = 2f;
        Goods zz = new Goods();
        zz.id = "sex3";
        zz.name = "丝袜";
        zz.category = "情趣用品";
        zz.price = 150.9f;
        Goods aa = new Goods();
        aa.id = "sex4";
        aa.name = "杜蕾斯";
        aa.category = "情趣用品";
        aa.price = 40.5f;

        goodsArr[0] = xx;
        goodsArr[1] = yy;
        goodsArr[2] = zz;
        goodsArr[3] = aa;
        int max = 0;
        for (int i=1; i < goodsArr.length; ++i){
            if (goodsArr[max].price < goodsArr[i].price){
                max = i;
            }
        }
        System.out.println(goodsArr[max].id + ":" + goodsArr[max].name + "," + goodsArr[max].category + "," + goodsArr[max].price + "$");
    }
}
