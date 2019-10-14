package com.zut;

import com.zut.service.BossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        BossService bossService;
        System.out.println("显式配置形式....");
        bossService= (BossService) applicationContext.getBean("bossService");
        System.out.println("1、修改信息.....");
        bossService.update();
        System.out.println("2、删除信息.....");
        bossService.delete();
        System.out.println("***************");
        bossService= (BossService) applicationContext.getBean("bossServiceImpl");//使用了注解，默认是首字母小写驼峰式名字bossServiceImpl
        System.out.println("注解配置形式");
        System.out.println("1、修改信息.....");
        bossService.update();
        System.out.println("2、删除信息.....");
        bossService.delete();
        System.out.println("***************");
        System.out.println("会议开始.......");
        System.out.println(applicationContext.getBean("meeting1"));
    }
}
