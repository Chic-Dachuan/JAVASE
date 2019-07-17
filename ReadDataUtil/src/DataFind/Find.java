package DataFind;

import java.io.IOException;
import java.util.List;

public interface Find {

    Data findDataById(int id) throws IOException;

    List<Data> findDataByName(String name) throws IOException;
}
