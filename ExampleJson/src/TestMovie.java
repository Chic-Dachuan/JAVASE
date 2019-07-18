import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestMovie {
    @Test
    public void testgosn(){
        String path = "C:/Users/18845/Desktop/rating.json";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
            String line = bufferedReader.readLine();
            MovieRate movieRate = MovieRateLog.parseLine(line);
            System.out.println(movieRate.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
