package cn.edu360.javase24.day05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class example {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String chuan = scan.nextLine();
        String[] arr = chuan.split(",");
        for (String xx:arr
             ) {
            // System.out.println(xx);
        }
        System.out.println("-----------------");
        HashSet<String> set = new HashSet<>();
        for (String xx: arr
             ) {
            set.add(xx);
        }
        for (String xx: set
        ) {
            System.out.println(xx);
        }
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        for (int k = 0; k < arr.length; ++k){
            hashMap1.put(k, arr[k]);
        }
        HashMap<String , Integer> hashMap2 = new HashMap<>();
        Set<Integer> set2 = hashMap1.keySet();
        for (int id: set2
             ) {
            String value = hashMap1.get(id);
            if (hashMap2.containsKey(value)){
                int value1 = hashMap2.get(value) + 1;
                hashMap2.put(value, value1);
            }else {
                hashMap2.put(value, 1);
            }
        }
        Set<String> set3 = hashMap2.keySet();
        for (String id: set3
             ) {
            System.out.println(id + ": " + hashMap2.get(id));
        }
    }
}
