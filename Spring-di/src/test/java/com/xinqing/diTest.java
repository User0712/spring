package com.xinqing;

import com.xinqing.entity.Header;
import com.xinqing.entity.Student;
import com.xinqing.entity.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-16 19:20
 */
public class diTest {
    public static void main(String[] args) {
        ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");
        Teacher teacher = Context.getBean("teacher", Teacher.class);
        Student goodStudent = Context.getBean("goodStudent", Student.class);
        System.out.println(teacher);
        System.out.println(goodStudent);
    }

}
