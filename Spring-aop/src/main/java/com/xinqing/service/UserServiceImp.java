package com.xinqing.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-23 16:19
 */

public class UserServiceImp implements UserService {

    public void add() {
        System.out.println("新增了一个用户！");

    }

    public void delete() {
        System.out.println("删除了一个用户！");

    }

    public void update() {
        System.out.println("更新了一个用户！");

    }

    public void query() {
        System.out.println("查询了一个用户！");

    }
}
