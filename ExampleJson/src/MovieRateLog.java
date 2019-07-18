import com.google.gson.Gson;

public class MovieRateLog {
    public static MovieRate parseLine(String line){
        Gson gson = new Gson();
        MovieRate movieRate = gson.fromJson(line, MovieRate.class);
        return movieRate;
    }
}
