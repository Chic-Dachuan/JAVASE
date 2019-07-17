package cn.edu360.javase24.day09.FileManage;

import java.io.*;

public class FileOutput {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\18845\\JAVAcode" +
                "\\helloworld\\src\\cn\\edu360\\javase24" +
                "\\day09\\FileManage\\mm.txt");  // 覆盖的方式写数据
        String a = "hello world";
        byte[] bytes = a.getBytes("GBK");  // 默认按照java文件编码格式编码
        fileOutputStream.write(bytes);  // 这样写入的数据会把原来的数据覆盖
        fileOutputStream.close();
        FileOutputStream fileOutputStream1 = new FileOutputStream("C:\\Users\\18845\\JAVAcode" +
                "\\helloworld\\src\\cn\\edu360\\javase24\\day09\\FileManage" +
                "\\mm.txt", true);  // 往文件中追加数据
        fileOutputStream1.write(",sb".getBytes());
        fileOutputStream1.close();

        /**
         * 写文本文件
         */
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter
                (new FileOutputStream("./src/cn/edu360/javase24" +
                        "/day09/FileManage/hh.txt", true), "UTF-8"));
        bufferedWriter.write("我爱你，凤姐\r\n");
        /**
         * windows 下换行 \r\n
         * Linux 下 \n
         */
        bufferedWriter.close();

    }
}
