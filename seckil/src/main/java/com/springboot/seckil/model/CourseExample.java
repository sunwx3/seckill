package com.springboot.seckil.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCoursenoIsNull() {
            addCriterion("courseNo is null");
            return (Criteria) this;
        }

        public Criteria andCoursenoIsNotNull() {
            addCriterion("courseNo is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenoEqualTo(Integer value) {
            addCriterion("courseNo =", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoNotEqualTo(Integer value) {
            addCriterion("courseNo <>", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoGreaterThan(Integer value) {
            addCriterion("courseNo >", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseNo >=", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoLessThan(Integer value) {
            addCriterion("courseNo <", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoLessThanOrEqualTo(Integer value) {
            addCriterion("courseNo <=", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoIn(List<Integer> values) {
            addCriterion("courseNo in", values, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoNotIn(List<Integer> values) {
            addCriterion("courseNo not in", values, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoBetween(Integer value1, Integer value2) {
            addCriterion("courseNo between", value1, value2, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoNotBetween(Integer value1, Integer value2) {
            addCriterion("courseNo not between", value1, value2, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNull() {
            addCriterion("courseName is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("courseName is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("courseName =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("courseName <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("courseName >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("courseName >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("courseName <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("courseName <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("courseName like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("courseName not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("courseName in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("courseName not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("courseName between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("courseName not between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNull() {
            addCriterion("teacherName is null");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNotNull() {
            addCriterion("teacherName is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernameEqualTo(String value) {
            addCriterion("teacherName =", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotEqualTo(String value) {
            addCriterion("teacherName <>", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThan(String value) {
            addCriterion("teacherName >", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThanOrEqualTo(String value) {
            addCriterion("teacherName >=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThan(String value) {
            addCriterion("teacherName <", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThanOrEqualTo(String value) {
            addCriterion("teacherName <=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLike(String value) {
            addCriterion("teacherName like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotLike(String value) {
            addCriterion("teacherName not like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameIn(List<String> values) {
            addCriterion("teacherName in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotIn(List<String> values) {
            addCriterion("teacherName not in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameBetween(String value1, String value2) {
            addCriterion("teacherName between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotBetween(String value1, String value2) {
            addCriterion("teacherName not between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andCoursedesciptionIsNull() {
            addCriterion("courseDesciption is null");
            return (Criteria) this;
        }

        public Criteria andCoursedesciptionIsNotNull() {
            addCriterion("courseDesciption is not null");
            return (Criteria) this;
        }

        public Criteria andCoursedesciptionEqualTo(String value) {
            addCriterion("courseDesciption =", value, "coursedesciption");
            return (Criteria) this;
        }

        public Criteria andCoursedesciptionNotEqualTo(String value) {
            addCriterion("courseDesciption <>", value, "coursedesciption");
            return (Criteria) this;
        }

        public Criteria andCoursedesciptionGreaterThan(String value) {
            addCriterion("courseDesciption >", value, "coursedesciption");
            return (Criteria) this;
        }

        public Criteria andCoursedesciptionGreaterThanOrEqualTo(String value) {
            addCriterion("courseDesciption >=", value, "coursedesciption");
            return (Criteria) this;
        }

        public Criteria andCoursedesciptionLessThan(String value) {
            addCriterion("courseDesciption <", value, "coursedesciption");
            return (Criteria) this;
        }

        public Criteria andCoursedesciptionLessThanOrEqualTo(String value) {
            addCriterion("courseDesciption <=", value, "coursedesciption");
            return (Criteria) this;
        }

        public Criteria andCoursedesciptionLike(String value) {
            addCriterion("courseDesciption like", value, "coursedesciption");
            return (Criteria) this;
        }

        public Criteria andCoursedesciptionNotLike(String value) {
            addCriterion("courseDesciption not like", value, "coursedesciption");
            return (Criteria) this;
        }

        public Criteria andCoursedesciptionIn(List<String> values) {
            addCriterion("courseDesciption in", values, "coursedesciption");
            return (Criteria) this;
        }

        public Criteria andCoursedesciptionNotIn(List<String> values) {
            addCriterion("courseDesciption not in", values, "coursedesciption");
            return (Criteria) this;
        }

        public Criteria andCoursedesciptionBetween(String value1, String value2) {
            addCriterion("courseDesciption between", value1, value2, "coursedesciption");
            return (Criteria) this;
        }

        public Criteria andCoursedesciptionNotBetween(String value1, String value2) {
            addCriterion("courseDesciption not between", value1, value2, "coursedesciption");
            return (Criteria) this;
        }

        public Criteria andCourseperiodIsNull() {
            addCriterion("coursePeriod is null");
            return (Criteria) this;
        }

        public Criteria andCourseperiodIsNotNull() {
            addCriterion("coursePeriod is not null");
            return (Criteria) this;
        }

        public Criteria andCourseperiodEqualTo(String value) {
            addCriterion("coursePeriod =", value, "courseperiod");
            return (Criteria) this;
        }

        public Criteria andCourseperiodNotEqualTo(String value) {
            addCriterion("coursePeriod <>", value, "courseperiod");
            return (Criteria) this;
        }

        public Criteria andCourseperiodGreaterThan(String value) {
            addCriterion("coursePeriod >", value, "courseperiod");
            return (Criteria) this;
        }

        public Criteria andCourseperiodGreaterThanOrEqualTo(String value) {
            addCriterion("coursePeriod >=", value, "courseperiod");
            return (Criteria) this;
        }

        public Criteria andCourseperiodLessThan(String value) {
            addCriterion("coursePeriod <", value, "courseperiod");
            return (Criteria) this;
        }

        public Criteria andCourseperiodLessThanOrEqualTo(String value) {
            addCriterion("coursePeriod <=", value, "courseperiod");
            return (Criteria) this;
        }

        public Criteria andCourseperiodLike(String value) {
            addCriterion("coursePeriod like", value, "courseperiod");
            return (Criteria) this;
        }

        public Criteria andCourseperiodNotLike(String value) {
            addCriterion("coursePeriod not like", value, "courseperiod");
            return (Criteria) this;
        }

        public Criteria andCourseperiodIn(List<String> values) {
            addCriterion("coursePeriod in", values, "courseperiod");
            return (Criteria) this;
        }

        public Criteria andCourseperiodNotIn(List<String> values) {
            addCriterion("coursePeriod not in", values, "courseperiod");
            return (Criteria) this;
        }

        public Criteria andCourseperiodBetween(String value1, String value2) {
            addCriterion("coursePeriod between", value1, value2, "courseperiod");
            return (Criteria) this;
        }

        public Criteria andCourseperiodNotBetween(String value1, String value2) {
            addCriterion("coursePeriod not between", value1, value2, "courseperiod");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andCoursepriceIsNull() {
            addCriterion("coursePrice is null");
            return (Criteria) this;
        }

        public Criteria andCoursepriceIsNotNull() {
            addCriterion("coursePrice is not null");
            return (Criteria) this;
        }

        public Criteria andCoursepriceEqualTo(Long value) {
            addCriterion("coursePrice =", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceNotEqualTo(Long value) {
            addCriterion("coursePrice <>", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceGreaterThan(Long value) {
            addCriterion("coursePrice >", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceGreaterThanOrEqualTo(Long value) {
            addCriterion("coursePrice >=", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceLessThan(Long value) {
            addCriterion("coursePrice <", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceLessThanOrEqualTo(Long value) {
            addCriterion("coursePrice <=", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceIn(List<Long> values) {
            addCriterion("coursePrice in", values, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceNotIn(List<Long> values) {
            addCriterion("coursePrice not in", values, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceBetween(Long value1, Long value2) {
            addCriterion("coursePrice between", value1, value2, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceNotBetween(Long value1, Long value2) {
            addCriterion("coursePrice not between", value1, value2, "courseprice");
            return (Criteria) this;
        }

        public Criteria andStockquantityIsNull() {
            addCriterion("stockQuantity is null");
            return (Criteria) this;
        }

        public Criteria andStockquantityIsNotNull() {
            addCriterion("stockQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andStockquantityEqualTo(Integer value) {
            addCriterion("stockQuantity =", value, "stockquantity");
            return (Criteria) this;
        }

        public Criteria andStockquantityNotEqualTo(Integer value) {
            addCriterion("stockQuantity <>", value, "stockquantity");
            return (Criteria) this;
        }

        public Criteria andStockquantityGreaterThan(Integer value) {
            addCriterion("stockQuantity >", value, "stockquantity");
            return (Criteria) this;
        }

        public Criteria andStockquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockQuantity >=", value, "stockquantity");
            return (Criteria) this;
        }

        public Criteria andStockquantityLessThan(Integer value) {
            addCriterion("stockQuantity <", value, "stockquantity");
            return (Criteria) this;
        }

        public Criteria andStockquantityLessThanOrEqualTo(Integer value) {
            addCriterion("stockQuantity <=", value, "stockquantity");
            return (Criteria) this;
        }

        public Criteria andStockquantityIn(List<Integer> values) {
            addCriterion("stockQuantity in", values, "stockquantity");
            return (Criteria) this;
        }

        public Criteria andStockquantityNotIn(List<Integer> values) {
            addCriterion("stockQuantity not in", values, "stockquantity");
            return (Criteria) this;
        }

        public Criteria andStockquantityBetween(Integer value1, Integer value2) {
            addCriterion("stockQuantity between", value1, value2, "stockquantity");
            return (Criteria) this;
        }

        public Criteria andStockquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("stockQuantity not between", value1, value2, "stockquantity");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIsNull() {
            addCriterion("courseType is null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIsNotNull() {
            addCriterion("courseType is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeEqualTo(Integer value) {
            addCriterion("courseType =", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotEqualTo(Integer value) {
            addCriterion("courseType <>", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThan(Integer value) {
            addCriterion("courseType >", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseType >=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThan(Integer value) {
            addCriterion("courseType <", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThanOrEqualTo(Integer value) {
            addCriterion("courseType <=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIn(List<Integer> values) {
            addCriterion("courseType in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotIn(List<Integer> values) {
            addCriterion("courseType not in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeBetween(Integer value1, Integer value2) {
            addCriterion("courseType between", value1, value2, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("courseType not between", value1, value2, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursepicIsNull() {
            addCriterion("coursePic is null");
            return (Criteria) this;
        }

        public Criteria andCoursepicIsNotNull() {
            addCriterion("coursePic is not null");
            return (Criteria) this;
        }

        public Criteria andCoursepicEqualTo(String value) {
            addCriterion("coursePic =", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicNotEqualTo(String value) {
            addCriterion("coursePic <>", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicGreaterThan(String value) {
            addCriterion("coursePic >", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicGreaterThanOrEqualTo(String value) {
            addCriterion("coursePic >=", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicLessThan(String value) {
            addCriterion("coursePic <", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicLessThanOrEqualTo(String value) {
            addCriterion("coursePic <=", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicLike(String value) {
            addCriterion("coursePic like", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicNotLike(String value) {
            addCriterion("coursePic not like", value, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicIn(List<String> values) {
            addCriterion("coursePic in", values, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicNotIn(List<String> values) {
            addCriterion("coursePic not in", values, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicBetween(String value1, String value2) {
            addCriterion("coursePic between", value1, value2, "coursepic");
            return (Criteria) this;
        }

        public Criteria andCoursepicNotBetween(String value1, String value2) {
            addCriterion("coursePic not between", value1, value2, "coursepic");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}