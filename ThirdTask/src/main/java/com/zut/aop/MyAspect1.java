package com.zut.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
//ProxyFactoryBean方式
public class MyAspect1 implements MethodInterceptor {
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

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        myBefore();
        Object object=methodInvocation.proceed();
        myAfter();
        return object;
    }
}
