package com.springboot.seckil.service;

import com.springboot.seckil.VO.CourseVO;
import com.springboot.seckil.model.Course;

import java.util.List;

public interface CourseService {
    public List<Course> selectCourseList();
    public Course selectCourseByCourseNo(int courseNo);
    //查库存
    public int selectStockByCourseNo(int courseNo);
    //减库存
    public int updateStockByCourseNo(Course course);
}
