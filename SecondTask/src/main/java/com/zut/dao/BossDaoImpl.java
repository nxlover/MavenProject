package com.zut.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//注解形式配置BossDao(也可省略，xml中已经配置了bossDao的bean)
@Repository
public class BossDaoImpl implements BossDao{
    public void update() {
        System.out.println("模拟修改老板信息...");
    }

    public void delete() {
        System.out.println("模拟删除老板信息...");
    }
}
