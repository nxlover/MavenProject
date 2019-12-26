package com.zut.service;

import com.zut.pojo.User;

public interface UserService {
    int insertSelective(User record);
    User selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(User record);
}
