package com.zut.service;

import com.zut.dao.BossDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//注解形式配置BossService(也可省略，xml中已经配置了bossService的bean)
@Service
public class BossServiceImpl implements BossService{
    @Autowired
    private BossDao bossDao;
    //添加BossDao属性的setter方法，实现依赖注入，基于显示配置
    public void setBossDao(BossDao bossDao) {
        this.bossDao = bossDao;
    }

    public void update() {
        bossDao.update();
    }

    public void delete() {
        bossDao.delete();
    }
}
