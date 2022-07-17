package com.xinqing.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-16 19:10
 */
public class Teacher {
    private String name;
    private int age;
    private Student student;
    private String[] book;
    private List<String> hobby;
    private Map<String,String> game;
    private Set<String> family;
    private Properties info;
    private String wife;


    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", student=" + student.toString() +
                '}';
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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String[] getBook() {
        return book;
    }

    public void setBook(String[] book) {
        this.book = book;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public Map<String, String> getGame() {
        return game;
    }

    public void setGame(Map<String, String> game) {
        this.game = game;
    }

    public Set<String> getFamily() {
        return family;
    }

    public void setFamily(Set<String> family) {
        this.family = family;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }
}
