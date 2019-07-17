package cn.edu360.javase24.day10;

import java.io.*;

public class ObjectOutput {
    /**
     * 对象输出流
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "./src/cn/edu360/javase24/day10/o.obj";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        Us u1 = new Us("慕容复",38,5600f, 1232132312);
        /**
         * 要求写入对象时可以序列化的
         */

        objectOutputStream.writeObject(u1);  // 直接把对象写入文件
        // NotSerializableException  这样直接写会报错，不可以序列化，对象是有数据组织结构的
        objectOutputStream.close();

        ObjectInputStream dot = new ObjectInputStream(new FileInputStream(path));
        Us readObject = (Us) dot.readObject();
        System.out.println(readObject);

    }
}
