## 一、spring依赖注入的方式
+ 1.Setter注入
~~~xml
<bean id="student" class="com.xinqing.entity.Student">
    <property name="name" value="康馨朵朵"/>
    <property name="school" value="双流中学"/>
</bean>
~~~

+ 2.构造器注入
  + 参数下标注入
  ~~~xml
  <bean id="student2" class="com.xinqing.entity.Student">
      <constructor-arg index="0" value="1234"/>
      <constructor-arg index="1" value="1234"/>
  </bean>
  ~~~
  + 参数类型注入
  ~~~xml~~~~~~~~
  <bean id="header3" class="com.xinqing.entity.Header">
      <constructor-arg type="int" value="50"/>
      <constructor-arg type="java.lang.String" value="成都信息工程大学"/>
  </bean>
  ~~~
+ 3.p命名空间和c命名空间注入
  + p命名空间注入
  ~~~xml
  <bean id="header" class="com.xinqing.entity.Header" p:age="50" p:school="四川大学"/>
  ~~~
  + c命名空间注入
  ~~~xml
  <bean id="header2" class="com.xinqing.entity.Header" c:age="55" c:school="电子科技大学"/>
  ~~~
  
## 二、Bean作用域
+ 单例模式
~~~xml
<bean id="accountService" class="com.something.DefaultAccountService"/>
<!-- the following is equivalent, though redundant (singleton scope is the default) -->
<bean id="accountService1" class="com.something.DefaultAccountService" scope="singleton"/>
~~~
+ 原型模式
~~~xml
<bean id="accountService" class="com.something.DefaultAccountService" scope="prototype"/>
~~~
  