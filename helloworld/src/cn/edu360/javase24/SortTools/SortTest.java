package cn.edu360.javase24.SortTools;

import cn.edu360.javase24.day06.HomeWork.Users;

import java.util.ArrayList;

public class SortTest {
    public static void main(String [] args){
        Users u1 = new Users("1", "嫦娥", 18, 100f);
        Users u2 = new Users("2", "吴刚", 18, 1200f);
        Users u3 = new Users("3", "八戒", 8, 1020f);
        Users u4 = new Users("4", "玉兔", 3, 90f);
        ArrayList<Users> uList = new ArrayList<>();
        uList.add(u1);
        uList.add(u2);
        uList.add(u3);
        uList.add(u4);

        SortUtil.sort(uList, new AgeCompare());
        for (Users u:uList
             ) {
            System.out.println(u);
        }
        System.out.println("-------------------------");
        SortUtil.sort(uList, new SalaryCompare());
        for (Users u:uList
        ) {
            System.out.println(u);
        }
        System.out.println("-------------------------");
        SortUtil.sort(uList, new AgeandSalaryCompare());
        for (Users u:uList
        ) {
            System.out.println(u);
        }
    }
}
