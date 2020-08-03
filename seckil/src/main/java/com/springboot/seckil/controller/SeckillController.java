package com.springboot.seckil.controller;

import com.springboot.seckil.base.controller.BaseApiController;
import com.springboot.seckil.base.result.Result;
import com.springboot.seckil.model.Course;
import com.springboot.seckil.model.Orders;
import com.springboot.seckil.model.UserTest;
import com.springboot.seckil.service.SeckillService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeckillController extends BaseApiController implements InitializingBean {
    @Autowired
    private SeckillService seckillService;
    @RequestMapping("/seckill")
    public Result<Orders> seckill(Course course){
        UserTest userTest = new UserTest();
        userTest.setUsername("albb");
        System.out.println(userTest+"aaaaaaaaaaaa"+course+"aaaaaaaaaa");
        return seckillService.seckill(userTest, course);
    }
    @RequestMapping("/seckillResult")
    public Result<Orders> seckillResult(Course course){
        return seckillService.seckellResult(course.getCourseno());
    }
     //bean加载完成之后就会执行这个方法
    @Override
    public void afterPropertiesSet() throws Exception {
        seckillService.cacheAllCourse();
    }
}
