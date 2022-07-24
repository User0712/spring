package com.xinqing;

import com.xinqing.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-23 16:33
 */
public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

}
