package com.springboot.seckil.service.impl;

import com.springboot.seckil.mapper.CourseMapper;
import com.springboot.seckil.model.CourseExample;
import com.springboot.seckil.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;
    @Override
    public void selectCourseList() {
        CourseExample courseExample = new CourseExample();
        courseExample.createCriteria().andCoursenameIsNotNull();
        courseMapper.selectByExample(courseExample);
    }
}
