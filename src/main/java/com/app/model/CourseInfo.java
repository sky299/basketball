package com.app.model;


import com.app.dto.PageDto;

import java.io.Serializable;

/**
 * @author 柳江
 * @since 2022-08-29
 */
public class CourseInfo extends PageDto implements Serializable {
    /**
     * 课程表主键（自增
）
     */
    private Integer id;

    /**
     * 课程名
     */
    private String courseName;

    /**
     * 课程课时
     */
    private Long courseTime;

    /**
     * 课程头像
     */
    private String photo;

    /**
     * 课程介绍
     */
    private String courseIntroduce;

    /**
     * 课程价格
     */
    private String coursePrice;

    /**
     * 上课开始时间
     */
    private Long tocourseBiginTime;

    /**
     * 上课结束时间
     */
    private Long tocourseFinishTime;

    /**
     * 购买人数
     */
    private String enrollTotal;

    /**
     * 是否为活动课程(0不是，1是)
     */
    private Integer isShaky;

    /**
     * 课程状态（0上架，1下架）
     */
    private Integer courseState;

    /**
     * 校区名
     */
    private String schoolName;

    /**
     * 是否删除(0未删除，1已删除)
     */
    private Integer isDelete;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 修改时间
     */
    private Long updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Long getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(Long courseTime) {
        this.courseTime = courseTime;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getCourseIntroduce() {
        return courseIntroduce;
    }

    public void setCourseIntroduce(String courseIntroduce) {
        this.courseIntroduce = courseIntroduce;
    }

    public String getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(String coursePrice) {
        this.coursePrice = coursePrice;
    }

    public Long getTocourseBiginTime() {
        return tocourseBiginTime;
    }

    public void setTocourseBiginTime(Long tocourseBiginTime) {
        this.tocourseBiginTime = tocourseBiginTime;
    }

    public Long getTocourseFinishTime() {
        return tocourseFinishTime;
    }

    public void setTocourseFinishTime(Long tocourseFinishTime) {
        this.tocourseFinishTime = tocourseFinishTime;
    }

    public String getEnrollTotal() {
        return enrollTotal;
    }

    public void setEnrollTotal(String enrollTotal) {
        this.enrollTotal = enrollTotal;
    }

    public Integer getIsShaky() {
        return isShaky;
    }

    public void setIsShaky(Integer isShaky) {
        this.isShaky = isShaky;
    }

    public Integer getCourseState() {
        return courseState;
    }

    public void setCourseState(Integer courseState) {
        this.courseState = courseState;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public CourseInfo(String courseName, Long courseTime, String photo, String courseIntroduce, String coursePrice, Long tocourseBiginTime, Long tocourseFinishTime, String enrollTotal, Integer isShaky, Integer courseState, String schoolName, Integer isDelete, Long createTime, Long updateTime) {
        this.courseName = courseName;
        this.courseTime = courseTime;
        this.photo = photo;
        this.courseIntroduce = courseIntroduce;
        this.coursePrice = coursePrice;
        this.tocourseBiginTime = tocourseBiginTime;
        this.tocourseFinishTime = tocourseFinishTime;
        this.enrollTotal = enrollTotal;
        this.isShaky = isShaky;
        this.courseState = courseState;
        this.schoolName = schoolName;
        this.isDelete = isDelete;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
    public CourseInfo(Integer id,String courseName, Long courseTime, String photo, String courseIntroduce, String coursePrice, Long tocourseBiginTime, Long tocourseFinishTime, String enrollTotal, Integer isShaky, Integer courseState, String schoolName, Integer isDelete, Long createTime, Long updateTime) {
        this.id = id;
        this.courseName = courseName;
        this.courseTime = courseTime;
        this.photo = photo;
        this.courseIntroduce = courseIntroduce;
        this.coursePrice = coursePrice;
        this.tocourseBiginTime = tocourseBiginTime;
        this.tocourseFinishTime = tocourseFinishTime;
        this.enrollTotal = enrollTotal;
        this.isShaky = isShaky;
        this.courseState = courseState;
        this.schoolName = schoolName;
        this.isDelete = isDelete;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
    public CourseInfo() {
    }
}
