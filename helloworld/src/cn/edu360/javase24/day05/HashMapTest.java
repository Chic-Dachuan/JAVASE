package cn.edu360.javase24.day05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String [] args){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Jobs");  // 放入数据
        hashMap.put(2, "Zerkerbery");
        hashMap.put(3, "James");
        String a = hashMap.get(3);  // 取出数据 根据键取数据
        System.out.println(a);

        int size = hashMap.size();  // 获取散列表的长度
        System.out.println(size);

        boolean flage = hashMap.remove(1, "Jobs");  // 移除数据
        // 可以只传键， 传键不返回， 既传键又传值返回布尔值
        System.out.println(flage);
        // 判断是否真的移除     1. 可以获取对应键，看是否又返回
        /**
         * 当对应的key的value值为None时，这种方法失效
         */
        //2. containskey(3) 判断指定的key是否存在
        boolean ff = hashMap.containsKey(1);
        System.out.println(ff);

        System.out.println("》》》》》》》》》");

        /**
         * HashMap遍历
         */
        Set<Integer> keyset = hashMap.keySet();  // 返回所有的key 是一个集合数据类型
        /**
         * 集合遍历
         */

        /**
         * 遍历HashMap的另一种方法
         * entry() 条目  就是一对键值对
         * map.entrySet() 以条目作为元素构成entry集合
         */
        Set<Map.Entry<Integer, String >> entrySet = hashMap.entrySet();
        for (Map.Entry<Integer, String > ent:entrySet
             ) {
            System.out.println(ent.getKey() + "  " + ent.getValue());
        }

    }
}
