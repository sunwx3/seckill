package com.springboot.seckil.controller;

import com.springboot.seckil.Utils.CourseVoUtil;
import com.springboot.seckil.Utils.MD5Util;
import com.springboot.seckil.Utils.UUIDUtils;
import com.springboot.seckil.VO.CourseVO;
import com.springboot.seckil.VO.UserTestVO;
import com.springboot.seckil.base.controller.BaseApiController;
import com.springboot.seckil.base.result.Result;
import com.springboot.seckil.base.result.ResultCode;
import com.springboot.seckil.model.Course;
import com.springboot.seckil.model.UserTest;
import com.springboot.seckil.service.CourseService;
import com.springboot.seckil.service.UserTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
public class CourseController extends BaseApiController {
    private static Logger logger = LoggerFactory.getLogger(CourseController.class);
    @Autowired
    private CourseService courseService;
    @Autowired
    private UserTestService userTestService;
    @GetMapping("/selectCourseList")
    public Result<List<Course>> selectCourseList(){
        List<Course> courses = courseService.selectCourseList();
        return Result.success(courses);
    }
    @RequestMapping("/selectCourseByCourseNo")
    public Result<CourseVO> selectCourseByCourseNo(int courseNo){
        Course course = courseService.selectCourseByCourseNo(courseNo);
        if (course!=null){
            CourseVO courseVO = CourseVoUtil.courseToCourseVO(course);
            return Result.success(courseVO);
        }else {
            return Result.failure();
        }
    }
}
