package com.jckj.model;

import com.jckj.dto.PageDto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: SkLily
 * @date: 2022/8/29 14:10
 * @description:
 */
public class Grade extends PageDto{
    /**
     *班级id
     */
    private Integer id;
    /**
     *班级名
     */
    private String gradeName;
    /**
     *上课时间
     */
    private String gradeTime;
    /**
     *教练姓名
     */
    private String coachName;
    /**
     *班级照片
     */
    private String gradePhoto;
    /**
     *班级介绍
     */
    private String gradeDescribe;
    /**
     *班级状态
     */
    private Integer gradeStatus;
    /**
     *校区名
     */
    private String schoolName;
    /**
     *是否删除
     */
    private Boolean isDelete;
    /**
     *创建时间
     */
    private Long createTime;
    /**
     *修改时间
     */
    private Long updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getGradeTime() {
        return gradeTime;
    }

    public void setGradeTime(String gradeTime) {
        this.gradeTime = gradeTime;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getGradePhoto() {
        return gradePhoto;
    }

    public void setGradePhoto(String gradePhoto) {
        this.gradePhoto = gradePhoto;
    }

    public String getGradeDescribe() {
        return gradeDescribe;
    }

    public void setGradeDescribe(String gradeDescribe) {
        this.gradeDescribe = gradeDescribe;
    }

    public Integer getGradeStatus() {
        return gradeStatus;
    }

    public void setGradeStatus(Integer gradeStatus) {
        this.gradeStatus = gradeStatus;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
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

    public Grade() {
    }

    public Grade(Integer id, String gradeName, String gradeTime, String coachName, String gradePhoto, String gradeDescribe, Integer gradeStatus, String schoolName, Boolean isDelete, Long createTime, Long updateTime) {
        this.id = id;
        this.gradeName = gradeName;
        this.gradeTime = gradeTime;
        this.coachName = coachName;
        this.gradePhoto = gradePhoto;
        this.gradeDescribe = gradeDescribe;
        this.gradeStatus = gradeStatus;
        this.schoolName = schoolName;
        this.isDelete = isDelete;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
