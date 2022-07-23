## Spring注解开发
+ @Component 标记这个类为spring容器的组件
+ @Controller 标记这个类为spring容器的组件 扩展于@Component注解 标记在控制器层
+ @Service    标记这个类为spring容器的组件 扩展于@Component注解 标记在业务逻辑层
+ @Repository 标记这个类为spring容器的组件 扩展于@Component注解 标记在持久化层
+ @Configuration 
  作用等价于配置文件beans.xml文件中去配置<bean>标签的作用，一个@Configuration类等价于一个xml配置文件,
  因此，springboot中其实更多采用这种方式去做，而放弃配置xml文件。
  ~~~java
  @Configuration
  public class AppConfig {
  
      @Bean
      public MyService myService() {
          return new MyServiceImpl();
      }
  }
  ~~~
  等价于
  ~~~xml
  <beans>
      <bean id="myService" class="com.acme.services.MyServiceImpl"/>
  </beans>
  ~~~
  
+ @Scope 标记为该bean的作用域，为单例模式还是原型模式
+ @value 标记在属性或者setter方法上面，给属性赋值

  注解扫描的xml文件配置
~~~xml
  <context:component-scan base-package="com.xinqing"/>
~~~