package cn.edu360.javase24.SortTools;

import cn.edu360.javase24.day06.HomeWork.Users;

public class AgeCompare implements Compare{

    @Override
    public boolean compared(Users u1, Users u2) {
        return u1.getAge() < u2.getAge();
    }
}
