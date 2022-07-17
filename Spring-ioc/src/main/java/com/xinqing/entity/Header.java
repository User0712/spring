package com.xinqing.entity;

/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-16 19:38
 */
public class Header {
    private int age;
    private String school;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }


    @Override
    public String toString() {
        return "Header{" +
                "age=" + age +
                ", school='" + school + '\'' +
                '}';
    }
}
