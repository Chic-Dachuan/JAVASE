package cn.edu360.javase24.SortTools;

import cn.edu360.javase24.day06.HomeWork.Users;

import java.util.ArrayList;

public class SortUtil3 {
    public void sort(ArrayList<Users> uList){
        for (int i = 0; i < uList.size() - 1; ++i){
            for (int j = 0; j < uList.size() - 1 - i; ++j){
                boolean res = uList.get(j).Compared(uList.get(j + 1));  // 对象带有比较方法
                if (res){  // 让每一个对象都带有比较方法

                }
            }
        }
    }
}
