package DataFind;

import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        FindDataUitl findDataUitl = new FindDataUitl();
        Find find = findDataUitl.getInstance();
        find.findDataById(2);
    }

}
