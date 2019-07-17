package cn.edu360.javase24.day13.DataFind;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class Find {
    public static void main(String[] args){

    }
    public Data findDataById(int id) throws IOException {
        /**
         * 可以从文件中任何位置开始读取数据的工具  RandomAccessFile
         */
        String path = "./src/cn/edu360/javase24/day13/DataFind/Memery.java";
        RandomAccessFile raf = new RandomAccessFile(path, "r");
        /**
         * 读取id商品
         */
        long pos = id * 28;
        /**
         * 让raf的读取位置跳到指定的pos位置
         */
        raf.seek(pos);
        /**
         * 开始的读取数据
         */
        int pId = raf.readInt();
        /**
         * 再读取20字节
         */
        byte[] b = new byte[20];
        int read = raf.read(b);
        /**
         * 然后将20个字节转换为字符串
         */
        String string = new String(b);
        /**
         * 去掉首尾空格
         */
        String name = string.trim();

        /**
         * 再读取价格
         */
        float price = raf.readFloat();

        return new Data(pId, name, price);
    }

    public List<Data> findDataByName(String name) throws IOException {
        String path = "./src/cn/edu360/javase24/day13/DataFind/Memery.java";
        RandomAccessFile raf = new RandomAccessFile(path, "r");
        int i = 0;
        ArrayList<Data> dList = new ArrayList<>();
        while ( ((i + 1) * 28) <= raf.length()){
            raf.seek(4 + i * 28);
            byte[] b = new byte[20];
            raf.read(b);
            String string = new String(b);
            if (string.equals(name))
            {
                float price = raf.readFloat();
                raf.seek(i * 28);
                int pid = raf.readInt();
                dList.add(new Data(pid, string, price));
            }
            ++i;
        }
        return dList;
    }
}
