package cn.edu360.javase24.day09.FileManage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadByte {
    public static void main(String[] args) throws IOException {
        // 读取文件， 首先要构造一个FileInputStream对象
        FileInputStream fis = new FileInputStream("C:\\Users\\18845\\JAVAcode\\helloworld" +
                "\\src\\cn\\edu360\\javase24\\day09\\FileManage\\a.txt");
        // FileInputStream 是一种字节流 按照一个一个字节读取
//        int read = 0;
//        while ((read = fis.read()) != -1) {
//            // System.out.println(read);
//        }

        /**
         * 读取数据 就是字符
         * 先读数(比特流)  然后按编码格式转码
         */
//        int read1;
//        while ((read1 = fis.read()) != -1) {
//            char c = (char)read1;  // 强转  把数转换会字符串 使用ASCII编码格式
//            System.out.println(c);
//        }

        /**
         * 一次读取多个字节  转换为某个字符串
         */
        // byte[] buff = new byte[5];  // 一次读取buff长度个字节,并且读取到的数据存入buff中

        // int num = fis.read(buff);  // 返回真实读取到的字节数

        // String string =  new String(buff, 0, num);  // 利用字节数组转换字符串
        // System.out.println(string);

        /**
         * 用while循环反复读取
         */
//        while (fis.read(buff) != -1){  // 读完返回-1
//            String string1 =  new String(buff);  // 利用字节数组转换字符串
//            System.out.println(string1);
//        }

        /**
         * 按行读取文件
         */
        /**
         * 自己实现
         * int read = 0;
         *         byte[] buff = new byte[1024];
         *         int i = 0;
         *         while ((read = fis.read()) != 0){
         *             if (read == 13){
         *                 break;
         *             }
         *             buff[i] = (byte)read;
         *             i++;
         *         }
         *         System.out.println( new String(buff, 0, i));
         */

//        BufferedReader readerLine = new BufferedReader(new InputStreamReader(
//                new FileInputStream("C:\\Users\\18845\\JAVAcode\\helloworld" +
//                        "\\src\\cn\\edu360\\javase24\\day09\\FileManage\\a.txt")));
//        String line =null;
//        while ((line = readerLine.readLine()) != null ){
//            System.out.println(line);
//        }
        /**
         * 读取文件完成之后要关闭文件按流
         */
        // readerLine.close();

        /**
         * 读取汉字
         * BufferedReader()
         */
        BufferedReader readerLine = new BufferedReader(new InputStreamReader(
                new FileInputStream("C:\\Users\\18845\\JAVAcode\\helloworld" +
                        "\\src\\cn\\edu360\\javase24\\day09\\FileManage\\b.txt"), "UTF-8"));
        String line = readerLine.readLine();
        System.out.println(line);
        readerLine.close();
    }
}
