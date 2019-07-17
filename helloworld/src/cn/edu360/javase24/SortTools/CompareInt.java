package cn.edu360.javase24.SortTools;

public class CompareInt implements Compare2<Integer> {
    @Override
    public boolean compared(Integer u1, Integer u2) {
        return u1 < u2;
    }
}
