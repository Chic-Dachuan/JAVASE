package cn.edu360.javase24.day06.HomeWork;

import java.util.*;
import java.util.Map;

public class BaseTest {
    public static void main(String[] args){
        int[] Arr = new int[] {2, 3,4,5,6,7,1,8};
        for (int a: Arr
             ) {
            System.out.println(a);
        }
        for (int k = Arr.length - 1; k >= 0; --k){
            System.out.println(Arr[k]);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int k = 0; k < 10; ++k){
            arrayList.add(k);
        }
        for (int k = arrayList.size() - 1; k >= 0; --k){
            System.out.println(arrayList.get(k));
        }
        for (int k: arrayList
             ) {
            System.out.println(k);
        }

        /**
         * hashset
         */
        HashSet<String> set = new HashSet<>();
        set.add("Jobs");
        set.add("James");
        set.add("Jordon");
        for (String a: set
             ) {
            System.out.println(a);
        }
        /**
         * hashmap
         */
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int k = 0; k < 10; ++k){
            hashMap.put(k, (k+1));
        }
        // 遍历方法一
        Set<Map.Entry<Integer, Integer>> entrySet = hashMap.entrySet();
        for (Map.Entry<Integer, Integer> ent: entrySet
             ) {
            if (ent.getValue() % 2 != 0){
                System.out.println(ent.getKey() + "," + ent.getValue());
            }
        }
        // 遍历方法二
        Set<Integer> set1 = hashMap.keySet();
        for (Integer key: set1
             ) {
            if (hashMap.get(key) % 2 != 0){
                System.out.println(key + ","+hashMap.get(key));
            }
        }
    }
}
