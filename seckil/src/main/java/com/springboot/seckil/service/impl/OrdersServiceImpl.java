package com.springboot.seckil.service.impl;

import com.springboot.seckil.mapper.OrdersMapper;
import com.springboot.seckil.model.Course;
import com.springboot.seckil.model.Orders;
import com.springboot.seckil.model.UserTest;
import com.springboot.seckil.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements OrderService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Override
    public Orders selectOrderByUsernameAndCourseNo(UserTest userTest, Course course) {
        Orders orders = new Orders();
        orders.setUsername(userTest.getUsername());
        orders.setCourseNo(String.valueOf(course.getCourseno()));
        Orders ordersList = ordersMapper.selectOrderByUsernameAndCourseNo(orders);
        return ordersList;
    }

    @Override
    public int insertOrders(Orders orders) {
        ordersMapper.insert(orders);
        return Math.toIntExact(orders.getOrderId());
    }

    @Override
    public Orders selectOrdersByOrderid(Orders orders) {
        Orders orders1 = ordersMapper.selectByPrimaryKey(orders.getOrderId());
        return orders1;
    }
}
