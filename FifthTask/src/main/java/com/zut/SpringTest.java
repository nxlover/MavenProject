package com.zut;

import com.zut.pojo.User;
import com.zut.service.OrdersService;
import com.zut.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class SpringTest {
    @Autowired
    private UserService userService;
    @Autowired
    private OrdersService ordersService;
    @Test
    public void test(){
        //1、编写针对user用户的查询：要求sql即能根据id进行单个用户信息的查询，也能根据多个id同时查询多个用户信息，以及根据用户名进行模糊查询，以及分页查询等等。。。。。。
        //2、编写针对user用户的更新操作，使用动态sql，依据传递的参数实现根据用户主键id可选择性的修改用户其他相关信息。。。
        //3、添加user用户信息，根据传递的参数实现有选择性的添加用户信息。
        User user =new User(null,"路人甲",new Date(),"男","北京");
        userService.insertSelective(user);
        userService.selectByPrimaryKey(1);
        user.setSex("女");
        user.setId(1);
        //1）、根据订单编号查询用户信息
        //2）、根据用户名查询用户的订单信息
        //3）、根据用户名查询用户所购买的所有商品信息
        userService.updateByPrimaryKeySelective(user);
        ordersService.selectOrdersByUserName("王五");
        ordersService.selectOrdersDetailByUserName("王五");
        ordersService.selectUserByOrdersId(1);
    }
}
