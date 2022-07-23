package com.xinqing.controller;

import com.xinqing.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-23 11:28
 */
@Controller
public class MyController {
    @Autowired
    MyService myService;

    public MyService getMyService() {
        return myService;
    }

    public MyController() {
    }
}
