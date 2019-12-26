package com.zut.aop;
//AspectJ的xml显示配置方式
public class MyAspect2 {
    public void myBefore(){
        System.out.println("开启事务操作....");
    }
    public void myAfter(){
        System.out.println("提交事务操作....");
    }
    public void myAround(){
        System.out.println("环绕通知：");
        System.out.println("前置开启事务、后置提交事务....");
    }
    public void myAfterThrowing(){
        System.out.println("异常通知....");
    }
}
