package com.xinqing.entity;

/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-16 19:10
 */
public class Teacher {
    private String name;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", student=" + student.toString() +
                '}';
    }

    private int age;
    private  Student student;

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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
