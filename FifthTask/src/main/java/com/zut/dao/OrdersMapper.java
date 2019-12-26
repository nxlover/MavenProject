package com.zut.dao;

import com.zut.pojo.Items;
import com.zut.pojo.Orders;
import com.zut.pojo.OrdersExample;
import java.util.List;

import com.zut.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
    long countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Orders record);

    int insertSelective(Orders record);

    User selectUserByOrdersId(Integer id);

    Orders selectOrdersByUserName(String name);

    Items selectOrdersDetailByUserName(String name);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}