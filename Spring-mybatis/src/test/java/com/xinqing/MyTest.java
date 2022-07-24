package com.xinqing;

import com.xinqing.entity.Command;
import com.xinqing.mapper.CommandMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-23 23:16
 */
public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-mybatis.xml");
        CommandMapper commandMapper = context.getBean("commandMapper", CommandMapper.class);
        List<Command> result = commandMapper.select(1);
        for (Command command : result) {
            System.out.println(command);
        }
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-mybatis.xml");
        CommandMapper commandMapper = context.getBean("commandMapper2", CommandMapper.class);
        List<Command> result = commandMapper.select(1);
        for (Command command : result) {
            System.out.println(command);
        }
    }

}
