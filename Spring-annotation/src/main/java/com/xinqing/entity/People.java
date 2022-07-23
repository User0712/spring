package com.xinqing.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-23 9:29
 */
@Component
public class People {
    @Autowired
    private Cat cat;
    @Resource
    private Dog dog;

    public People() {
        System.out.println("我是一个人");
    }

    public People(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }
}
