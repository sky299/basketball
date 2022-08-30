package com.jckj.model;

import com.jckj.dto.PageDto;

import java.io.Serializable;

/**
 * @author: SkLily
 * @date: 2022/8/29 16:41
 * @description:
 */
public class School extends PageDto {
    /**
     *校区id
     */
    private Integer id;
    /**
     *校区名
     */
    private String schoolName;
    /**
     *校区地址
     */
    private String schoolAddress;
    /**
     *校区介绍
     */
    private String schoolIntroduce;
    /**
     *校区电话
     */
    private String schoolPhone;
    /**
     *校区照片
     */
    private String schoolPhoto;
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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public String getSchoolIntroduce() {
        return schoolIntroduce;
    }

    public void setSchoolIntroduce(String schoolIntroduce) {
        this.schoolIntroduce = schoolIntroduce;
    }

    public String getSchoolPhone() {
        return schoolPhone;
    }

    public void setSchoolPhone(String schoolPhone) {
        this.schoolPhone = schoolPhone;
    }

    public String getSchoolPhoto() {
        return schoolPhoto;
    }

    public void setSchoolPhoto(String schoolPhoto) {
        this.schoolPhoto = schoolPhoto;
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

    public School() {
    }

    public School(Integer id, String schoolName, String schoolAddress, String schoolIntroduce, String schoolPhone, String schoolPhoto, Boolean isDelete, Long createTime, Long updateTime) {
        this.id = id;
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.schoolIntroduce = schoolIntroduce;
        this.schoolPhone = schoolPhone;
        this.schoolPhoto = schoolPhoto;
        this.isDelete = isDelete;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
