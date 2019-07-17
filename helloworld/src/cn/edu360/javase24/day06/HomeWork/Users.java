package cn.edu360.javase24.day06.HomeWork;

public class Users implements Comparable<Users>{
    private String id;
    private String name;
    private int age;
    private float salary;
    public Users(){

    }

    public Users(String id, String name, int age, float salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return this.id + "," + this.name + "," + this.age + "," + this.salary;
    }

    // 自己实现的
    public boolean Compared(Users other){
        return this.age > other.getAge();
    }

    /**
     * Collections.sort() 可以调用
     * @param o
     * @return
     */
    @Override
    public int compareTo(Users o) {
        if (this.age > o.getAge()){
            return 1;
        }
        if (this.age == o.getAge()){
            return 0;
        }
        return -1;
    }
}
