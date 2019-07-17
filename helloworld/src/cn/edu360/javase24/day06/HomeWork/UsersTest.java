package cn.edu360.javase24.day06.HomeWork;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UsersTest {
    @Test
    public void test(){
        Users u1 = new Users("1", "张三", 18, 2000f);
        Users u2 = new Users("2", "李四", 20, 3000f);
        Users u3 = new Users("3", "王五", 19, 2500f);
        Users u4 = new Users("4", "赵六", 19, 3600f);
        Users u5 = new Users("5", "铁蛋", 20, 2800f);
        ArrayList<Users> usersList = new ArrayList<>();
        usersList.add(u1);
        usersList.add(u2);
        usersList.add(u3);
        usersList.add(u4);
        usersList.add(u5);
        /**
         * 年龄排序
         */
        for (int i = 0; i < usersList.size() - 1; ++i){
            for (int j = 0; j < usersList.size() - 1 - i; ++j){
                Users userj = usersList.get(j);
                Users userj_1 = usersList.get(j+1);
                if (userj.getAge() < userj_1.getAge()){
                    usersList.set(j, userj_1);
                    usersList.set((j + 1), userj);
                }
            }
        }
        for (Users u: usersList
        ) {
            System.out.println(u.toString());
        }
        /**
         * 薪水排序
         */
        for (int i = 0; i < usersList.size() - 1; ++i){
            for (int j = 0; j < usersList.size() - 1 - i; ++j){
                Users userj = usersList.get(j);
                Users userj_1 = usersList.get(j+1);
                if (userj.getSalary() > userj_1.getSalary()){
                    usersList.set(j, userj_1);
                    usersList.set((j + 1), userj);
                }
            }
        }
        for (Users u: usersList
        ) {
            System.out.println(u.toString());
        }
        /**
         * 年龄排序 ---> 薪水排序
         */
        System.out.println("-----------------------------");
        for (int i = 0; i < usersList.size() - 1; ++i){
            for (int j = 0; j < usersList.size() - 1 - i; ++j){
                Users userj = usersList.get(j);
                Users userj_1 = usersList.get(j+1);
                if (userj.getAge() < userj_1.getAge()){
                    usersList.set(j, userj_1);
                    usersList.set((j + 1), userj);
                }
                if ((userj.getAge() == userj_1.getAge()) && (userj.getSalary()
                        > userj_1.getSalary())){
                    usersList.set(j, userj_1);
                    usersList.set((j + 1), userj);
                }
            }
        }
        for (Users u: usersList
        ) {
            System.out.println(u.toString());
        }
        System.out.println("***********************************");
        /**
         * 第二题
         */
        HashMap<String, Users> uMap = new HashMap<>();
        uMap.put(u1.getId(), u1);
        uMap.put(u2.getId(), u2);
        uMap.put(u3.getId(), u3);
        uMap.put(u4.getId(), u4);
        uMap.put(u5.getId(), u5);

        ArrayList<Users> uList = new ArrayList<>();
        Set<Map.Entry<String, Users>> entrySet = uMap.entrySet();
        for (Map.Entry<String, Users> ent: entrySet
                ){
            if (ent.getValue().getSalary() > 2500){
                uList.add(ent.getValue());
            }
        }
        for (Users u: uList
             ) {
            System.out.println(u.toString());
        }
    }
}
