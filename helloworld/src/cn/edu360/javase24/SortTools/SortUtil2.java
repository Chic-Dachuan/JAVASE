package cn.edu360.javase24.SortTools;
/**
 * 泛型编程
 */

import java.util.ArrayList;

public class SortUtil2<T> {
    public void sort(ArrayList<T> list, Compare2<T> compare){
        for (int i = 0; i< list.size() - 1; ++i){
            for (int j = 0; j < list.size() - 1 -i; ++j){
                boolean res= compare.compared(list.get(j), list.get(j + 1));
                if (res){
                    T tmp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set((j + 1), tmp);
                }
            }
        }

    }
}
