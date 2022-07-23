package com.xinqing;

import com.xinqing.entity.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-23 9:37
 */
public class AutoWiredTest {
    @Test
    public void  test1(){
        ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");
        People people = Context.getBean("people", People.class);
        People people1 = Context.getBean("people", People.class);

        People people2 = Context.getBean("people2", People.class);
        People people3 = Context.getBean("people2", People.class);

        People people4 = Context.getBean("people4", People.class);
        People people5 = Context.getBean("people4", People.class);
        //原型模式
        System.out.println(people.hashCode());
        System.out.println(people1.hashCode());
        //单例模式  配置文件自动装配
        System.out.println(people2.hashCode());
        System.out.println(people3.hashCode());
        //        注解方式自动装配
        System.out.println(people4.hashCode());
        System.out.println(people5.hashCode());

    }
}
