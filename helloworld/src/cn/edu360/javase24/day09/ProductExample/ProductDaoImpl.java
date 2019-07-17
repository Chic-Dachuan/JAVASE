package cn.edu360.javase24.day09.ProductExample;

import java.io.*;
import java.util.ArrayList;

public class ProductDaoImpl implements ProductDao {
    @Override
    public void addProduct(String line) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("./src/cn/edu360/javase24/day09/FileManage" +
                        "/Product.dat", true), "UTF-8"));
        bufferedWriter.write(line + "\n");
        bufferedWriter.close();
    }

    @Override
    public ArrayList<Productes> getAllProducts() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader
                (new FileInputStream("./src/cn/edu360/javase24/day09/FileManage/Product.dat")
                        , "UTF-8"));
        String line = null;
        ArrayList<Productes> pList = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null){
            String[] spl = line.split(",");
            Productes p = new Productes(spl[0], spl[1], Float.parseFloat(spl[2]));
            pList.add(p);
        }
        bufferedReader.close();
        return pList;
    }
}
