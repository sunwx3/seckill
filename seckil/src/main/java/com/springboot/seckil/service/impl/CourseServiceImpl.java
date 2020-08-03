package com.springboot.seckil.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.springboot.seckil.Utils.CourseVoUtil;
import com.springboot.seckil.VO.CourseVO;
import com.springboot.seckil.mapper.CourseMapper;
import com.springboot.seckil.model.Course;
import com.springboot.seckil.model.CourseExample;
import com.springboot.seckil.redis.CourseRedis;
import com.springboot.seckil.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private CourseRedis courseRedis;

    private static final String ALL_COURSE_REDIS = "allCourseRedis";

    @Override
    public List<Course> selectCourseList() {
        List<Course> courses = new ArrayList<Course>();
        CourseExample courseExample = new CourseExample();
        courseExample.createCriteria().andCoursenameIsNotNull();
        //从redis中获取数据
        String courseListString = (String) courseRedis.getString(ALL_COURSE_REDIS);
        courses = JSON.parseArray(courseListString,Course.class);
        //从mysql中获取
        if(StringUtils.isEmpty(courseListString)){
            System.out.println("都数据库");
            courses = courseMapper.selectByExample(courseExample);
            String coursesString = JSON.toJSONString(courses);
            courseRedis.putString(ALL_COURSE_REDIS,coursesString,-1);
        }
        return courses;
    }

    @Override
    public Course selectCourseByCourseNo(int courseNo) {
        Optional<Course> courses = Optional.ofNullable(courseMapper.selectByPrimaryKey(courseNo));
        return courses.orElse(null);
    }

    @Override
    public int selectStockByCourseNo(int courseNo) {
        Course course = courseMapper.selectByPrimaryKey(courseNo);
        int stock =course.getStockquantity();
        return stock;
    }

    @Override
    public int updateStockByCourseNo(Course course) {
        int success = courseMapper.updateStockByCourseNo(course);
        return success;
    }
}
