package cn.edu360.javase24.SortTools;

import cn.edu360.javase24.day06.HomeWork.Users;

public class AgeandSalaryCompare implements Compare {
    @Override
    public boolean compared(Users u1, Users u2) {
        if (u1.getAge() > u2.getAge()){
            return true;
        }
        if (u1.getAge() == u2.getAge()){
            return u1.getSalary() > u2.getSalary();
        }
        return false;
    }
}
