package com.xinqing;

import com.xinqing.config.MyConfig;
import com.xinqing.controller.MyController;
import com.xinqing.entity.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-23 11:06
 */
public class AnnotationTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people", People.class);
        System.out.println(people.getCat().getName());
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        MyController myController = context.getBean("myController", MyController.class);
        System.out.println(myController.getMyService().getPeople().getCat().getName());
    }

    @Test
    public void test3(){
        //加载配置文件的java类
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        MyController myController = context.getBean("myController", MyController.class);
        System.out.println(myController.getMyService().getPeople().getCat().getName());

    }

}
