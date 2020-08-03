package com.springboot.seckil.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Orders implements Serializable {
    private static final long serialVersionUID = 1536250756538283540L;

    /**
     * orders.order_id: 
     * <p>
     */
    private Long orderId;

    /**
     * orders.course_no: 
     * <p>
     */
    private String courseNo;

    /**
     * orders.username: 
     * <p>
     */
    private String username;

    /**
     * orders.course_name: 
     * <p>
     */
    private String courseName;

    /**
     * orders.course_price: 
     * <p>
     */
    private Long coursePrice;

    /**
     * orders.pay_price: 
     * <p>
     * <code>
     * 支付价格<br>
     * </code>
     */
    private BigDecimal payPrice;

    /**
     * orders.payment: 
     * <p>
     * <code>
     * 支付方式<br>
     * </code>
     */
    private String payment;

    /**
     * orders.pay_status: 
     * <p>
     */
    private String payStatus;

    /**
     * orders.pay_date: 
     * <p>
     */
    private Date payDate;

    /**
     * orders.create_date: 
     * <p>
     */
    private Date createDate;

    /**
     * orders.creat_by: 
     * <p>
     */
    private String creatBy;

    /**
     * orders.update_date: 
     * <p>
     */
    private Date updateDate;

    /**
     * orders.update_by: 
     * <p>
     */
    private String updateBy;

    /**
     * orders.course_pic: 
     * <p>
     */
    private String coursePic;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo == null ? null : courseNo.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Long getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(Long coursePrice) {
        this.coursePrice = coursePrice;
    }

    public BigDecimal getPayPrice(Long courseprice) {
        return payPrice;
    }

    public void setPayPrice(BigDecimal payPrice) {
        this.payPrice = payPrice;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreatBy() {
        return creatBy;
    }

    public void setCreatBy(String creatBy) {
        this.creatBy = creatBy == null ? null : creatBy.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public String getCoursePic() {
        return coursePic;
    }

    public void setCoursePic(String coursePic) {
        this.coursePic = coursePic == null ? null : coursePic.trim();
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", courseNo='" + courseNo + '\'' +
                ", username='" + username + '\'' +
                ", courseName='" + courseName + '\'' +
                ", coursePrice=" + coursePrice +
                ", payPrice=" + payPrice +
                ", payment='" + payment + '\'' +
                ", payStatus='" + payStatus + '\'' +
                ", payDate=" + payDate +
                ", createDate=" + createDate +
                ", creatBy='" + creatBy + '\'' +
                ", updateDate=" + updateDate +
                ", updateBy='" + updateBy + '\'' +
                ", coursePic='" + coursePic + '\'' +
                '}';
    }
}