package cn.edu360.javase24.day10;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputDemo {
    /**
     * 包装流  可以将各种数据类型，在内部转成byte字节，然后利用FileOutputStream写入文件
     */
    public static void main(String[] args) throws IOException {
        String path = "./src/cn/edu360/javase24/day10/o.txt";
        /**
         * 写入
         */
        DataOutputStream dot = new DataOutputStream(new FileOutputStream(path, true));
        // 写一个整数
        // int a = 688;
        /**
         * 这样写的是一个int类型数据 4个字节
         */
        //dot.writeInt(a);
        //long age = 190111001;
        //dot.writeLong(age);
        String cc = "我是凤姐";
        // writeutf 在写入数据时，会在前面额外增加2个字节的长度记录
        dot.writeUTF(cc);

        dot.writeInt(48);
        dot.close();

    }
}
