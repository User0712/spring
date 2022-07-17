package com.xinqing.entity;

/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-16 19:10
 */
public class Student {
    private String name;
    private String school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
