package com.xinqing.diy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-23 17:01
 */

@Aspect //标记为一个切面
public class AnnotationAspect {
    @Before("execution(* com.xinqing.service.UserServiceImp.*(..))")
    public void beofre(){
        System.out.println("========我是注解切面方法执行前==========");
    }


    @After("execution(* com.xinqing.service.UserServiceImp.*(..))")
    public void after(){
        System.out.println("========我是注解切面方法执行后==========");
    }
}
