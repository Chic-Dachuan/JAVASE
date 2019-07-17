package cn.edu360.javase24.day09.ProductExample;

import java.io.IOException;
import java.util.ArrayList;

public interface ProductDao {
    public void addProduct(String line) throws IOException;
    public ArrayList<Productes> getAllProducts() throws IOException;
}
