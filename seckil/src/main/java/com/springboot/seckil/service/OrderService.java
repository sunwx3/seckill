package com.springboot.seckil.service;

import com.springboot.seckil.model.Course;
import com.springboot.seckil.model.Orders;
import com.springboot.seckil.model.UserTest;

public interface OrderService {
    public Orders selectOrderByUsernameAndCourseNo(UserTest userTest, Course course);
    //插入一条数据返回主键
    public int insertOrders(Orders orders);
    //根据主键查询一条数据
    public Orders selectOrdersByOrderid(Orders orders);
}
