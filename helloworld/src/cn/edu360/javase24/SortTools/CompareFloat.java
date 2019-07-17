package cn.edu360.javase24.SortTools;

public class CompareFloat implements Compare2<Float> {
    @Override
    public boolean compared(Float u1, Float u2) {
        return u1 > u2;
    }
}
