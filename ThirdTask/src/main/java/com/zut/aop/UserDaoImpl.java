package com.zut.aop;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void addUser() {
        System.out.println("添加用户！");
    }
}
