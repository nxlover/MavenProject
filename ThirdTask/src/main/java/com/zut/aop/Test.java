package com.zut.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("ProxyFactoryBean方式.....");
        UserDao userDao1= (UserDao) applicationContext.getBean("userDaoProxy");
        userDao1.addUser();
        System.out.println("*****************");
        System.out.println("AspectJ的xml显示配置方式....");
        UserDao userDao2= (UserDao) applicationContext.getBean("userDao1");
        userDao2.addUser();
        System.out.println("*****************");
        System.out.println("AspectJ的注解形式配置方式....");
        UserDao userDao3= (UserDao) applicationContext.getBean("userDaoImpl");
        userDao3.addUser();
    }
}
