package cn.edu360.javase24.day13.DataFind;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Memery {
    public static void main(String[] args) throws Exception {
        Data data1 = new Data(0, "苹果", 10.5f);
        Data data2 = new Data(1, "Apple", 4555f);
        Data data3 = new Data(3, "泰国香蕉", 12.2f);
        Data data4 = new Data(4, "波罗蜜", 13.3f);
        save(data1);
        save(data2);
        save(data3);
        save(data4);
    }

    private static void save(Data data) throws Exception {
        /**
         * 将数据按照既定规则存入文件中
         * id 占 4个字节 name 占 20字节  price 占 4个字节
         */
        String path = "./src/cn/edu360/javase24/day13/DataFind/Memery.java";
        DataOutputStream dout = new DataOutputStream(new FileOutputStream(path, true));
        dout.write(data.getId());  // 写入id
        byte[] bytes = data.getName().getBytes();
        byte[] b = new byte[20];
        /**
         * jdk提供的数组拷贝工具方法
         * 参数1：源数组
         * 参数2：从源数组第几个元素开始拷贝
         * 参数3：目的数组
         * 参数4：从目的数组第几个元素开始拷入
         * 参数5：拷贝多少个元素
         */
        System.arraycopy(bytes, 0, b, 0, bytes.length);
        // dout.write(data1.getName().getBytes("GBK"));  // 写入名字
        dout.write(b);
        dout.writeFloat(data.getPrice());
        dout.close();
    }
}
