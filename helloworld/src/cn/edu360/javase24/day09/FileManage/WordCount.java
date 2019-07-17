package cn.edu360.javase24.day09.FileManage;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCount {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("C:" +
                "\\Users\\18845\\JAVAcode\\helloworld\\src\\cn\\edu360" +
                "\\javase24\\day09\\FileManage\\b.txt"), "UTF-8"));
        String line = null;
        HashMap<String, Integer> countMap = new HashMap<String, Integer>();
        while ((line = bufferedReader.readLine()) != null){
            String[] word = line.split(" ");
            for (String words: word)
                if (countMap.containsKey(words)) {
                    Integer value = countMap.get(words);
                    countMap.put(words, (value + 1));
                }else {
                    countMap.put(words, 1);
                }
        }
        bufferedReader.close();
        // 打印结果
        Set<Map.Entry<String, Integer>> entrycountMap = countMap.entrySet();
        for (Map.Entry<String, Integer> ent: entrycountMap
             ) {
            System.out.println(ent.getKey() + "  :  " + ent.getValue());
        }
    }
}
