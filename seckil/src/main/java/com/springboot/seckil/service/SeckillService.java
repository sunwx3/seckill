package com.springboot.seckil.service;

import com.springboot.seckil.base.result.Result;
import com.springboot.seckil.model.Course;
import com.springboot.seckil.model.Orders;
import com.springboot.seckil.model.UserTest;

public interface SeckillService {
    public Result<Orders> seckill(UserTest userTest, Course course);

    public void cacheAllCourse();

    public Orders seckillTest(UserTest userTest , Course course);

    public Result<Orders> seckellResult(Integer courseno);
}
