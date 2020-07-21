package com.springboot.seckil.model;

import java.io.Serializable;
import java.util.Date;

public class Course implements Serializable {
    private static final long serialVersionUID = 1536250756538283540L;

    /**
     * course.courseNo: 
     * <p>
     * <code>
     * 唯一主键<br>
     * </code>
     */
    private Integer courseno;

    /**
     * course.courseName: 
     * <p>
     * <code>
     * 课程名<br>
     * </code>
     */
    private String coursename;

    /**
     * course.teacherName: 
     * <p>
     * <code>
     * 教师名<br>
     * </code>
     */
    private String teachername;

    /**
     * course.courseDesciption: 
     * <p>
     * <code>
     * 课程描述<br>
     * </code>
     */
    private String coursedesciption;

    /**
     * course.coursePeriod: 
     * <p>
     */
    private String courseperiod;

    /**
     * course.startTime: 
     * <p>
     * <code>
     * 课程开始时间<br>
     * </code>
     */
    private Date starttime;

    /**
     * course.endTime: 
     * <p>
     * <code>
     * 课程结束时间<br>
     * </code>
     */
    private Date endtime;

    /**
     * course.coursePrice: 
     * <p>
     * <code>
     * 课程价格<br>
     * </code>
     */
    private Long courseprice;

    /**
     * course.stockQuantity: 
     * <p>
     * <code>
     * 课程库存<br>
     * </code>
     */
    private Integer stockquantity;

    /**
     * course.courseType: 
     * <p>
     * <code>
     * 课程类型<br>
     * </code>
     */
    private Integer coursetype;

    /**
     * course.coursePic: 
     * <p>
     * <code>
     * 课程图片<br>
     * </code>
     */
    private String coursepic;

    public Integer getCourseno() {
        return courseno;
    }

    public void setCourseno(Integer courseno) {
        this.courseno = courseno;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public String getCoursedesciption() {
        return coursedesciption;
    }

    public void setCoursedesciption(String coursedesciption) {
        this.coursedesciption = coursedesciption == null ? null : coursedesciption.trim();
    }

    public String getCourseperiod() {
        return courseperiod;
    }

    public void setCourseperiod(String courseperiod) {
        this.courseperiod = courseperiod == null ? null : courseperiod.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Long getCourseprice() {
        return courseprice;
    }

    public void setCourseprice(Long courseprice) {
        this.courseprice = courseprice;
    }

    public Integer getStockquantity() {
        return stockquantity;
    }

    public void setStockquantity(Integer stockquantity) {
        this.stockquantity = stockquantity;
    }

    public Integer getCoursetype() {
        return coursetype;
    }

    public void setCoursetype(Integer coursetype) {
        this.coursetype = coursetype;
    }

    public String getCoursepic() {
        return coursepic;
    }

    public void setCoursepic(String coursepic) {
        this.coursepic = coursepic == null ? null : coursepic.trim();
    }
}