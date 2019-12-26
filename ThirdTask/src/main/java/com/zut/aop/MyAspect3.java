package com.zut.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
//AspectJ的注解形式配置方式
@Aspect
@Component
public class MyAspect3 {
    @Pointcut("execution(* com.zut.aop.*.*(..))")
    private void PointCut(){}
    @Before("PointCut()")
    public void myBefore(){
        System.out.println("开启事务操作....");
    }
    @AfterReturning("PointCut()")
    public void myAfter(){
        System.out.println("提交事务操作....");
    }
    @Around("PointCut()")
    public void myAround(){
        System.out.println("环绕通知：");
        System.out.println("前置开启事务、后置提交事务....");
    }
    @AfterThrowing("PointCut()")
    public void myAfterThrowing(){
        System.out.println("异常通知....");
    }
}
