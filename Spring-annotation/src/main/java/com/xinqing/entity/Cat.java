package com.xinqing.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-23 9:28
 */
@Component
public class Cat {

    String name;

    @Value("噜噜")
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Cat() {
        System.out.println("我是一只小猫");
    }
}
