package com.xinqing.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-23 16:09
 */
public class BeforeLog implements MethodBeforeAdvice {

    //method：要执行的目标对象方法
    //objects：参数
    //o：目标对象

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+"被执行了");
    }
}
