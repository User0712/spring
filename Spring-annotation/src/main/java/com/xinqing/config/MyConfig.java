package com.xinqing.config;

import com.xinqing.controller.MyController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-23 11:47
 */
@Configuration
//扫描Spring组件的位置
@ComponentScan(basePackages="com.xinqing")
public class MyConfig {
    //方法的返回值 Bean的Class
    //方法的方法名 Bean的id
    @Bean
    public MyController myController(){
        return new MyController();
    }
}
