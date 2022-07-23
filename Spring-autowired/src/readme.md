## Bean自动装配
  + 装配方式
  ~~~
  1.在xml中自动装配
  2.在java中显示装配
  3.隐式自动装配bean
  ~~~
  + 自动装配方式
  ~~~
  1.byName 通过bean的id进行匹配
  2.byType 通过bean的类的类名
  ~~~
  + 注解实现
  ~~~
  1.@AutoWired 通过byType方式实现去寻找对应Class的bean
  2.@Resource  先通过byName方式实现，如果根据找不到对应id的bean，再通过byType的方式去寻找对应Class的bean
  ~~~
