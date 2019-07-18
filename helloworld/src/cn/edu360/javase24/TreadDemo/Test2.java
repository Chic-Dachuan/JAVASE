package cn.edu360.javase24.TreadDemo;

import java.util.HashMap;

public class Test2 {
    public static void main(String[] args){
//        ProductDb pdb = new ProductDb();
//        HashMap<String, String> pmp = pdb.pMap;
        ProductDb pdb = ProductDb.getProductDb();
        System.out.println(pdb);
    }

}
