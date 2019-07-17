package cn.edu360.javase24.day06.IOCoding;

import java.util.HashMap;

/**
 *模块与模块之间没有直接联系
 * 通过接口相连
 */

public interface XXService {
    /**
     * 接口中只有方法声明，没有具体实现
     * 这些接口不能被实例化
     * @return
     */
    public String step1();
    public int step2();
    public HashMap<Integer, String> step3(String a);
}
