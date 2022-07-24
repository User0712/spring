## Spring框架整合Mybatis框架 
### 第一种方式
+ mybatis的第一要素：数据源的bean注入
~~~xml
<bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
    <property name="driverClassName" value="com.mysql.cj.jdbc.Driver"/>
    <property name="username" value="root"/>
    <property name="password" value="123456"/>
    <property name="url" value="jdbc:mysql://localhost:3306/mockentry?useUnicode=true&amp;characterEncoding=UTF-8&amp;userSSL=false&amp;serverTimezone=UTC"/>
</bean>
~~~
+ mybatis的第二要素：注入sqlSession工厂类的bean，依赖数据源的bean
~~~xml
<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
    <property name="dataSource" ref="dataSource"/>
    <!--绑定mybatis配置文件-->
    <property name="configLocation" value="classpath:mybatis-config.xml"/>
    <!--可以去掉这个配置-->
    <property name="mapperLocations" value="classpath:com/xinqing/mapper/*.xml"/>
</bean>
~~~
+ mybatis的第三要素：注入sqlSession类的bean，依赖sqlSession工厂类的bean
~~~xml
<bean id="sqlSession" class="org.mybatis.spring.SqlSessionTemplate">
    <!--只能使用构造器注入，因为没有setter方法-->
    <constructor-arg index="0" ref="sqlSessionFactory"/>
</bean>
~~~
+ mybatis的第四要素：注入Mapper接口实现类的bean，依赖sqlSession类的bean
~~~xml
<bean id="commandMapper" class="com.xinqing.mapper.CommandMapperImp">
    <property name="sqlSession" ref="sqlSession"/>
</bean>
~~~

~~~java
public class CommandMapperImp implements CommandMapper {
    private SqlSessionTemplate sqlSession;

    public List<Command> select(int id) {
        return sqlSession.getMapper(CommandMapper.class).select(id);
    }

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }
}
~~~

### 第二种方式
+ 第一种方式的的第三要素和第四要素进行整合，注入Mapper接口实现类的bean，依赖sqlSession工厂类的bean
~~~xml
<bean id="commandMapper2" class="com.xinqing.mapper.CommandMapperImp2">
    <property name="sqlSessionFactory" ref="sqlSessionFactory"/>
</bean>
~~~
~~~java
public class CommandMapperImp2 extends SqlSessionDaoSupport implements CommandMapper {
    public List<Command> select(int id) {
        return getSqlSession().getMapper(CommandMapper.class).select(id);
    }
}
~~~
## 注意事项
+ maven静态资源过滤问题，添加一下依赖配置
~~~xml
<build>
    <resources>
        <resource>
            <directory>src/main/java</directory>
            <includes>
                <include>**/*.xml</include>
            </includes>
        </resource>
    </resources>
</build>
~~~
