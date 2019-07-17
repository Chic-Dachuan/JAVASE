package cn.edu360.javase24.day10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ExersizeDemo {
    public static void main(String[] args) throws IOException {
        Pro p1 = new Pro("p01", "苹果", 100, 12.5f);
        Pro p2 = new Pro("p02", "橙子", 50, 10.5f);
        Pro p3 = new Pro("p03", "香蕉", 100, 2.5f);
        Pro p4 = new Pro("p04", "葡萄", 100, 15.5f);

        ArrayList<Pro> pList = new ArrayList<>();
        pList.add(p1);
        pList.add(p2);
        pList.add(p3);
        pList.add(p4);

        String path = "./src/cn/edu360/javase24/day10/h.pod";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(pList);
        objectOutputStream.close();
    }
}
