package cn.edu360.javase24.day05.Shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 遍历map的方法:
 * 1. 先获取所有的key，然后根据key去map中取value值
 * Set<String> keySet = map.keySet();
 * for(String key: keySet){
 *
 * }
 * 2. 先获取所有的Entry条目
 */

public class HashSetDemo {
    public static void main(String[] args){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int k = 0; k < 15; ++k){
            hashMap.put(k, k + 1);
           //  System.out.println( hashMap.get(k));
        }
        // 获取散列表的长度
        // System.out.println(hashMap.size());
        /**
         * 集合操作
         * 集合中的数据可以是任意类型 这里以Integer为例
         * hashset 数据存储是无序的
         */

        HashSet<Integer> set = new HashSet<>();
        for (int j = 0; j < 15; ++j){
            set.add(j);
        }
        // 获取集合长度
        // System.out.println(set.size());

        //移除元素
        set.remove(1);  // 移除元素1

        // 遍历集合元素
        /**
         * 集合元素的迭代器
         * boolean hasNext()  判断是否还有数据 并把数据游标后移
         * String next() 取当前数据
         */
        Iterator<Integer> iter = set.iterator();  // 集合set的迭代器赋给一个迭代器对象
        while (iter.hasNext()){
            int next = iter.next();
            // System.out.println(next);
        }
        /**
         * 增强for循环  替代上面的迭代过程
         */
        for (int num:set) {  // 遍历集合
           //  System.out.println(num);
        }
        /**
         * 增强for循环遍历数组
         */
        int[] arr = new int[]{1, 4, 2, 8, 5, 9};
        for (int x:arr
             ) {
           //  System.out.println(x);
        }
        /**
         * ArrayList 也可以用增强for循环遍历
         */
        ArrayList<Integer> list = new ArrayList<>();
        for (int k = 0; k < 10; ++k){
            list.add(k);
        }

        for (int m:list
             ) {
            System.out.println(m);
        }
    }
}
