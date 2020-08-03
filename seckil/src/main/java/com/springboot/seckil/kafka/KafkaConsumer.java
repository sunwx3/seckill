package com.springboot.seckil.kafka;

import com.springboot.seckil.model.Course;
import com.springboot.seckil.model.Orders;
import com.springboot.seckil.model.UserTest;
import com.springboot.seckil.service.CourseService;
import com.springboot.seckil.service.OrderService;
import com.springboot.seckil.service.SeckillService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @Autowired
    private CourseService courseService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private SeckillService seckillService;
    @KafkaListener(topics = "${spring.kafka.topic.userTopic}",groupId = "seconds-kill")
    public void listener(ConsumerRecord<?,?> record){
        //将kafka收到的参数取出来
        String[] message = record.value().toString().split(",");
        UserTest userTest = new UserTest();
        userTest.setUsername(message[1]);
        Course course = new Course();
        course.setCourseno(Integer.valueOf(message[0]));
        //看一下课程库存情况
        Course couese = courseService.selectCourseByCourseNo(course.getCourseno());
        int stock =couese.getStockquantity();
        if(stock<=0){
            return;
        }
        //看一下是否有订单

        Orders orders = orderService.selectOrderByUsernameAndCourseNo(userTest,course);
        if(orders!= null){
            return;
        }
        //数据库里下单减1，生成订单
        seckillService.seckillTest(userTest,couese);
    }
}
