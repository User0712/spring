package com.xinqing.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-23 16:15
 */
public class AfterLog implements AfterReturningAdvice {
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"方法，返回了"+returnValue);
    }
}
