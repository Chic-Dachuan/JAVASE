package cn.edu360.javase24.day04.ArrayListTest;

import java.util.ArrayList;

public class Tools {
    public static void sortList(ArrayList<Integer> list1){
        for (int i = 0; i < list1.size(); ++i){
            for (int j = 0; j < list1.size() - 1 - i; ++j){
                if (list1.get(j) > list1.get(j + 1)){
                    int tmp = list1.get(j);
                    list1.set(j, list1.get(j + 1));
                    list1.set(j + 1, tmp);
                }
            }
        }
    }

    public static void sortArray(int[] list2){
        for (int i = 0; i < list2.length - 1; ++i){
            for (int j = 0; j < list2.length - 1 - i; ++j){
                if (list2[j] > list2[j+1]){
                    int tmp = list2[j];
                    list2[j] = list2[j+1];
                    list2[j+1] = tmp;
                    System.out.println("hello world");
                }
            }
        }
    }

    public static int getMax(ArrayList<Integer> list){
        if(list.isEmpty()){
            System.out.println("list is empty!");
            return 0;
        }else {
            int max = list.get(0);
            for (int i = 1; i < list.size(); ++i) {
                if (max < list.get(i)) {
                    max = list.get(i);
                }
            }
            return max;
        }
    }

    public static int getMin(ArrayList<Integer> list){
        if(list.isEmpty()){
            System.out.println("list is empty!");
            return 0;
        }else {
            int min = list.get(0);
            for (int i = 1; i < list.size(); ++i) {
                if (min > list.get(i)) {
                    min = list.get(i);
                }
            }
            return min;
        }
    }

    public static float getAvg(ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); ++i){
            sum += list.get(i);
        }
        return (float) sum / list.size();
    }
}
