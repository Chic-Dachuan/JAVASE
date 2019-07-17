package cn.edu360.javase24.day04.ArrayListTest;
import java.util.ArrayList;
/**
 * ArrayList数据类型,是一个集合数据类型
 */

public class ArrayList1 {
    public static void main(String[] args){
        // < 数据类型 >
        // 创建一个装整形数据类型的list
        ArrayList<Integer> xx = new ArrayList<>();
        // 向ArrayList中加入数据
        xx.add(2);
        xx.add(3);
        // 取数据
        int num = xx.get(1);
        System.out.println(num);

        // 遍历列表
        for (int i = 0; i < xx.size(); ++i){
            System.out.println(xx.get(i));
        }

        // 删除数据
        System.out.println(">>>>>");
        xx.remove(0);
        for (int i = 0; i < xx.size(); ++i){
            System.out.println(xx.get(i));
        }
    }
}

