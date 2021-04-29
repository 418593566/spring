## 手动装配
```xml
        <bean id="pig" class="com.yifan.entity.Pig"/>
        <bean id="cat" class="com.yifan.entity.Cat"/> 
        <bean id="person" class="com.yifan.entity.Person">
            <property name="name" value="战歌"/>
            <property name="cat" ref="cat"/>
            <property name="pig" ref="pig"/>
        </bean>
```

## 自动装配
```bash
        autpwire 
         byName 找class 类中必须有 setxxx 后面值对应的bean id(唯一)
         byType 容器中恰好存在一个该属性类型的bean class(唯一)

        <bean id="pson" class="com.yifan.entity.Person" p:name="拉克丝" autowire="byType"/>
```

## 注解装配
```xml
<?xml version="1.0" encoding="UTF-8"?>
    <beans xmlns="http://www.springframework.org/schema/beans"
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xmlns:context="http://www.springframework.org/schema/context"
           xmlns:p="http://www.springframework.org/schema/p"
           xsi:schemaLocation="http://www.springframework.org/schema/beans
            https://www.springframework.org/schema/beans/spring-beans.xsd
            http://www.springframework.org/schema/context
            https://www.springframework.org/schema/context/spring-context.xsd">
    
        <context:annotation-config/>
        <bean id="pig" class="com.yifan.entity.Pig"/>
        <bean id="cat2" class="com.yifan.entity.Cat"/>
        <bean id="cat22" class="com.yifan.entity.Cat"/>
        <bean id="person" class="com.yifan.entity.Person" p:name="供稿人"/>
    </beans>
```

## 作用域
```bash
        <!--    scope singleton(单列模式) 全局一个
                -->
        <bean id="userTest" class="com.yifan.entity.User" c:name="张杀杀杀" scope="singleton"/>
        <!--    原型模式
                每次都会创建一个全新的bean实列-->
        <bean id="userText" class="com.yifan.entity.User" p:name="史蒂夫" scope="prototype"/>
```    

## 常用注解
- @Autowired 是通过 byName 来实现自动装配
  如果Autowired不能唯一自动装配上属性，则需要通过
        @Qualifier(value=xxx)
- @Resource  是默认是通过 byName 找不到则通过 byType 来实现自动装配
- @Value 注入值
- @Component 组件  等价于(<bean id="user" class="xxx.xxx.xx"/>)
      衍生的注解  
          mvc  
          .dao  @Repository  
          .controller  @Controller  
          .service   @Service  
      四个功能一样  
- @Scope  作用域  
- @Configuration 代表这是一个配置类 类似(<beas> </beans>)
- @ComponentScan("xxx") 扫描xxx下的修饰注解 则将这些类注册为spring容器中的bean。
- @NonNull可以标注在方法、字段、参数之上，表示对应的值不可以为空
- @Nullable注解可以标注在方法、字段、参数之上，表示对应的值可以为空
- @Aspect 标记这个是切面

## 动态代理(代理的是代理接口)
