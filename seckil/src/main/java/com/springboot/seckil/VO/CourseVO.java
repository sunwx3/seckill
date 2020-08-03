package com.springboot.seckil.VO;

import com.springboot.seckil.model.Course;

import java.io.Serializable;

public class CourseVO implements Serializable {
    private Course course;
    //课程状态
    private int courseStatus = 0;
    //距离开始还剩多少时间
    private int remainTime = 0;

    public CourseVO() {
    }

    public CourseVO(Course course, int courseStatus, int remainTime) {
        this.course = course;
        this.courseStatus = courseStatus;
        this.remainTime = remainTime;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(int courseStatus) {
        this.courseStatus = courseStatus;
    }

    public int getRemainTime() {
        return remainTime;
    }

    public void setRemainTime(int remainTime) {
        this.remainTime = remainTime;
    }

    @Override
    public String toString() {
        return "CourseVO{" +
                "course=" + course +
                ", courseStatus=" + courseStatus +
                ", remainTime=" + remainTime +
                '}';
    }
}
