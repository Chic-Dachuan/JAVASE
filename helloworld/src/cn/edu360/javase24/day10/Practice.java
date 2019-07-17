package cn.edu360.javase24.day10;

import java.io.*;

public class Practice {
    public static void main(String[] args) throws IOException {
        String path = "./src/cn/edu360/javase24/day10/o.dot";
        Us u1 = new Us("张三丰", 100, 1000.0f, 30000000);
        Us u2 = new Us("三mao", 3, 10.0f, 60000000);

        // 将两个对象写入文件
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(path));
        dos.writeUTF(u1.getName());
        dos.writeInt(u1.getAge());
        dos.writeFloat(u1.getPrice());
        dos.writeLong(u1.getHairNum());
        // dos.writeByte(13);
        dos.writeUTF(u2.getName());
        dos.writeInt(u2.getAge());
        dos.writeFloat(u2.getPrice());
        dos.writeLong(u2.getHairNum());

        dos.close();

        DataInputStream dot = new DataInputStream(new FileInputStream(path));
        Us u3 = new Us();
        u3.setName(dot.readUTF());
        u3.setAge(dot.readInt());
        u3.setPrice(dot.readFloat());
        u3.setHairNum(dot.readLong());
        dot.close();
        System.out.println(u3);
    }
}
