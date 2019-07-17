package cn.edu360.javase24.day10;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * 复杂类型对象的存取 --- 序列化与反序列化
 */
public class ObjectDemo {
    @Test
    public void TestList() throws IOException, ClassNotFoundException {
        ArrayList<Us> users = new ArrayList<>();
        String path = "./src/cn/edu360/javase24/day10/z.list";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        Us u1 = new Us("慕容复",38,5600f, 1232132312);
        Us u2 = new Us("扫地僧",88,10000f, 12132312);
        users.add(u1);
        users.add(u2);

        objectOutputStream.writeObject(users);
        objectOutputStream.close();

        /**
         * 从文件中读取list
         */
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        ArrayList<Us> usArrayList = (ArrayList<Us>) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(usArrayList);

    }
    @Test
    public void testMap() throws IOException, ClassNotFoundException {
        HashMap<String, Us> hashMap = new HashMap<>();
        String path = "./src/cn/edu360/javase24/day10/m.map";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        Us u1 = new Us("慕容复",38,5600f, 1232132312);
        Us u2 = new Us("扫地僧",88,10000f, 12132312);
        hashMap.put("1", u1);
        hashMap.put("2", u2);

        objectOutputStream.writeObject(hashMap);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));

        HashMap<String, Us> hashMap2 = (HashMap<String, Us>)objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(hashMap2);
    }
}
