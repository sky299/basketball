package com.jckj.model;

import com.jckj.dto.PageDto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 柳江
 * @since 2022-08-29
 */
public class OpenCourse extends PageDto implements Serializable {

    /**
     * 课程信息
     */
    private Integer id;

    /**
     * 课程id
     */
    private String courseId;

    /**
     * 课程名称
     */
    private String courseName;

    /**
     * 课程照片
     */
    private String photo;

    /**
     * 共计课时
     */
    private Integer courseHour;

    /**
     * 是否为活动课程(0不是，1是)
     */
    private Boolean shakyStatus;

    /**
     * 价钱
     */
    private BigDecimal price;

    /**
     * 课程状态（0下架，1上架）
     */
    private Boolean courseState;

    /**
     * 课程描述
     */
    private String describes;

    /**
     * 开始时间
     */
    private Long startTime;

    /**
     * 结束时间
     */
    private Long endTime;

    /**
     * 购买人数
     */
    private String payNumber;

    /**
     * 所属校区
     */
    private String schoolName;

    /**
     * 是否展示（0-否，1-是）
     */
    private Boolean shows;

    /**
     * 是否删除（0-否，1-是）
     */
    private Boolean isDelete;

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

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getCourseHour() {
        return courseHour;
    }

    public void setCourseHour(Integer courseHour) {
        this.courseHour = courseHour;
    }

    public Boolean getShakyStatus() {
        return shakyStatus;
    }

    public void setShakyStatus(Boolean shakyStatus) {
        this.shakyStatus = shakyStatus;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getCourseState() {
        return courseState;
    }

    public void setCourseState(Boolean courseState) {
        this.courseState = courseState;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public String getPayNumber() {
        return payNumber;
    }

    public void setPayNumber(String payNumber) {
        this.payNumber = payNumber;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Boolean getShows() {
        return shows;
    }

    public void setShows(Boolean shows) {
        this.shows = shows;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
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

    public OpenCourse(Integer id, String courseId, String courseName, String photo, Integer courseHour, Boolean shakyStatus, BigDecimal price, Boolean courseState, String describes, Long startTime, Long endTime, String payNumber, String schoolName, Boolean shows, Boolean isDelete, Long createTime, Long updateTime) {
        this.id = id;
        this.courseId = courseId;
        this.courseName = courseName;
        this.photo = photo;
        this.courseHour = courseHour;
        this.shakyStatus = shakyStatus;
        this.price = price;
        this.courseState = courseState;
        this.describes = describes;
        this.startTime = startTime;
        this.endTime = endTime;
        this.payNumber = payNumber;
        this.schoolName = schoolName;
        this.shows = shows;
        this.isDelete = isDelete;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public OpenCourse() {
    }
}
