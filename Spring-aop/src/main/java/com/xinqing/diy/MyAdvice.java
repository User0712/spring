package com.xinqing.diy;

/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-23 16:45
 */
public class MyAdvice {

    public void beofre(){
        System.out.println("========我在方法执行前==========");
    }
    public void after(){
        System.out.println("========我在方法执行后==========");
    }
}
