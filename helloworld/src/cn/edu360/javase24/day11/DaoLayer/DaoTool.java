package cn.edu360.javase24.day11.DaoLayer;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class DaoTool<T> {
    public HashMap<String, T> readMapFromFile(String path) throws Exception{
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        HashMap<String, T> readObject = (HashMap<String, T>) objectInputStream.readObject();
        objectInputStream.close();
        return readObject;
    }

    public void saveMapFile(HashMap<String, T> readObject, String path) throws Exception{
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(readObject);
        objectOutputStream.close();
    }
}
