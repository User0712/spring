package com.xinqing.service;

import com.xinqing.entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-23 11:27
 */
@Service
public class MyService {
    @Autowired
    People people;

    public People getPeople() {
        return people;
    }
}
