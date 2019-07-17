package cn.edu360.javase24.SortTools;
/**
 * 泛型编程
 *
 */

import cn.edu360.javase24.day06.HomeWork.Users;

import java.util.ArrayList;

public class SortUtil {
    public static void sort(ArrayList<Users> uList, Compare compare){
        for (int i =0; i< uList.size() - 1; ++i){
            for (int j = 0; j < uList.size() - 1 - i; ++j){
                boolean res = compare.compared(uList.get(j), uList.get(j + 1));
                if (res){
                    Users tmp = uList.get(j);
                    uList.set(j, uList.get(j + 1));
                    uList.set((j + 1), tmp);
                }
            }
        }
    }
}
