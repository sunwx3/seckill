package com.springboot.seckil.service.impl;

import com.springboot.seckil.base.result.Result;
import com.springboot.seckil.base.result.ResultCode;
import com.springboot.seckil.model.Course;
import com.springboot.seckil.model.Orders;
import com.springboot.seckil.model.UserTest;
import com.springboot.seckil.redis.CourseRedis;
import com.springboot.seckil.service.CourseService;
import com.springboot.seckil.service.OrderService;
import com.springboot.seckil.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SeckillServiceImpl implements SeckillService {
    @Autowired
    private CourseService courseService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private CourseRedis courseRedis;
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    private static Map<Integer,Boolean> isceckill = new HashMap<Integer,Boolean>();
    public Result<Orders> seckill(UserTest userTest, Course course) {
        Boolean isPass = isceckill.get(course.getCourseno());
        if(isPass){
            return Result.failure(ResultCode.SECKILL_NO_QUOTE);
        }
        //查库存
        //判断redis，进行减库存
        double stockQuantity = courseRedis.incr(String.valueOf(course.getCourseno()), -1);
        if(stockQuantity<=0){
            isceckill.put(course.getCourseno(),true);
            return Result.failure(ResultCode.SECKILL_NO_QUOTE);
        }
        //判断是否已经购买
        Orders orders = orderService.selectOrderByUsernameAndCourseNo(userTest, course);
        if(orders!= null){
            return Result.failure();
        }
        //减库存//下订单
        //Orders orders1 = seckillTest(userTest, course);
        kafkaTemplate.send("seckill",course.getCourseno()+","+userTest.getUsername());
        return Result.failure(ResultCode.SECKILL_LINE_UP);
    }

    @Override
    public void cacheAllCourse() {
        //数据库中查询所有课程
        List<Course> courses = courseService.selectCourseList();
        if(courses == null){
            return;
        }else {
            for (Course course : courses){
                courseRedis.putString(String.valueOf(course.getCourseno()),course.getStockquantity(),60,true);
                courseRedis.put(String.valueOf(course.getCourseno()),course,-1);
                isceckill.put(course.getCourseno(),false);
                System.out.println(isceckill.get(course.getCourseno())+"==============");
            }
        }
    }


    //进行购买，先减库存在下订单
    public Orders seckillTest(UserTest userTest , Course course){
        int success = courseService.updateStockByCourseNo(course);
        System.out.println("success=============="+success);
        if (success>0){
            Orders orders = new Orders();
            orders.setCourseNo(String.valueOf(course.getCourseno()));
            orders.setUsername(userTest.getUsername());
            orders.setCourseName("JAVA WEB开发");
            orders.setCoursePrice((long) 10);
            orders.getPayPrice((long) 19);
            orders.setPayStatus("0");
            orders.setCreateDate(new Date());
            int insert = orderService.insertOrders(orders);
            orders.setOrderId((long) insert);
            Orders orders1 = orderService.selectOrdersByOrderid(orders);
            return orders1;
        }
        return null;
    }

    @Override
    public Result<Orders> seckellResult(Integer courseno) {
        UserTest userTest = new UserTest();
        userTest.setUsername("aibb");
        Course course = new Course();
        course.setCourseno(courseno);
        Orders orders = orderService.selectOrderByUsernameAndCourseNo(userTest, course);
        if (orders == null) {
            return Result.failure(ResultCode.SECKILL_LINE_UP);
        }
        return Result.success(orders);
    }
}
