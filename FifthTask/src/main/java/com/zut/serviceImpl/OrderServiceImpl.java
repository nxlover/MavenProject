package com.zut.serviceImpl;

import com.zut.dao.OrdersMapper;
import com.zut.pojo.Items;
import com.zut.pojo.Orders;
import com.zut.pojo.User;
import com.zut.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public User selectUserByOrdersId(Integer id) {
        return ordersMapper.selectUserByOrdersId(id);
    }

    @Override
    public Orders selectOrdersByUserName(String name) {
        return ordersMapper.selectOrdersByUserName(name);
    }

    @Override
    public Items selectOrdersDetailByUserName(String name) {
        return ordersMapper.selectOrdersDetailByUserName(name);
    }
}
