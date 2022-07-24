## Spring AOP 面向切面编程
+ 切面：扩展的多个功能点
+ 通知：扩展的单个功能点
+ 目标：需要扩展功能的接口类
+ 代理：默认使用JDK动态代理，也可以使用CGlib动态代理
+ 切入点：需要扩展的功能处


### 方式1:实现接口
+ 实现MethodBeforeAdvice接口
+ 实现AfterReturningAdvice接口

~~~xml
<!--AOP相关配置方式1-->
<aop:config>
    <!--切点配置-->
    <aop:pointcut id="pointcut" expression="execution(* com.xinqing.service.*.*(..))"/>
    <!--切点增强的方法配置 将某个方法配置在某个切点处-->
    <aop:advisor advice-ref="afterLog" pointcut-ref="pointcut"/>
    <aop:advisor advice-ref="beforeLog" pointcut-ref="pointcut"/>
</aop:config>
~~~

### 方式2:自定义切面类
~~~xml
<bean id="myAdvice" class="com.xinqing.diy.MyAdvice"/>
<aop:config>
    <!--引用配置切面类-->
    <aop:aspect ref="myAdvice">
        <!--配置切点，用一个表达式匹配到方法-->
        <aop:pointcut id="point" expression="execution(* com.xinqing.service.*.*(..))"/>
        <!--将切面的方法配置到切点的方法前-->
        <aop:before method="beofre" pointcut-ref="point"/>
        <!--将切面的方法配置到切点的方法后-->
        <aop:after method="after" pointcut-ref="point"/>
    </aop:aspect>
</aop:config>
~~~

### 方式3:注解实现
~~~java
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
~~~

~~~xml
<!--注解驱动实现-->
<aop:aspectj-autoproxy/>
~~~