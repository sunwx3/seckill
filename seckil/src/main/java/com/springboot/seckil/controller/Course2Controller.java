package com.springboot.seckil.controller;

import com.springboot.seckil.base.result.Result;
import com.springboot.seckil.model.Course;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Course2Controller {
    private static Logger logger = LoggerFactory.getLogger(CourseController.class);
    @RequestMapping ("/selectCourseList")
    public Result<List<Course>> selectCourseList(){

        logger.info("进来了");

        return null;
    }
}
