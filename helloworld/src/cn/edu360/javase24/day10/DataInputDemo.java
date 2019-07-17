package cn.edu360.javase24.day10;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputDemo {
    /**
     * 可以从字节流中直接转换出具体的数据类型
     * @param args
     */
    public static void main(String[] args) throws IOException {
        String path = "./src/cn/edu360/javase24/day10/o.txt";
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(path));
        // int age = dataInputStream.readInt();
        // long age1 = dataInputStream.readLong();
        String cc = dataInputStream.readUTF();

        dataInputStream.close();
        System.out.println(cc);
        // System.out.println(age);
    }
}
