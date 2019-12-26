package com.zut.service;

import com.zut.pojo.Items;
import com.zut.pojo.Orders;
import com.zut.pojo.User;

public interface OrdersService {
    User selectUserByOrdersId(Integer id);

    Orders selectOrdersByUserName(String name);
    Items selectOrdersDetailByUserName(String name);
}
