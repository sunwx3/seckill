package com.springboot.seckil.Utils;

import com.springboot.seckil.VO.CourseVO;
import com.springboot.seckil.model.Course;

public class CourseVoUtil {
    public static final int COURSE_NOT_START = 0;//秒杀未开始
    public static final int COURSE_PROCESSING =1;//秒杀中
    public static final int COURSE_COMPLETE= 2 ;//秒杀结束
    public static CourseVO courseToCourseVO(Course course){
        CourseVO courseVO = new CourseVO();
        courseVO.setCourse(course);
        //课程状态，剩余时间
        long startTime = course.getStarttime().getTime();
        //课程结束时间
        long endTime = course.getEndtime().getTime();
        //当前时间
        long now = System.currentTimeMillis();
        int courseStates = COURSE_NOT_START;
        int remainTime = 0;
        if (startTime>now){
            courseStates = COURSE_NOT_START;
            remainTime = (int) (startTime - now)/100;
        }else if(now>endTime){
            courseStates = COURSE_COMPLETE;
            remainTime = -1;
        }else {
            courseStates = COURSE_PROCESSING;
            remainTime =1;
        }
        courseVO.setCourseStatus(courseStates);
        courseVO.setRemainTime(remainTime);
        return courseVO;
    }
}
