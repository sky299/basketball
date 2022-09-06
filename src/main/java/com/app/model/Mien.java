package com.app.model;

import com.app.dto.PageDto;

/**
 * @author: SkLily
 * @date: 2022/8/30 9:33
 * @description:
 */
public class Mien extends PageDto {
    /**
     *风采id
     */
    private Integer id;
    /**
     *学员id
     */
    private Integer studentId;
    /**
     *风采照片
     */
    private String mienPhoto;
    /**
     *风采视频
     */
    private String mienVideo;
    /**
     *是否隐私
     */
    private Boolean mienStatus;
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

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getMienPhoto() {
        return mienPhoto;
    }

    public void setMienPhoto(String mienPhoto) {
        this.mienPhoto = mienPhoto;
    }

    public String getMienVideo() {
        return mienVideo;
    }

    public void setMienVideo(String mienVideo) {
        this.mienVideo = mienVideo;
    }

    public Boolean getMienStatus() {
        return mienStatus;
    }

    public void setMienStatus(Boolean mienStatus) {
        this.mienStatus = mienStatus;
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

    public Mien() {
    }

    public Mien(Integer id, Integer studentId, String mienPhoto, String mienVideo, Boolean mienStatus, String schoolName, Boolean isDelete, Long createTime, Long updateTime) {
        this.id = id;
        this.studentId = studentId;
        this.mienPhoto = mienPhoto;
        this.mienVideo = mienVideo;
        this.mienStatus = mienStatus;
        this.schoolName = schoolName;
        this.isDelete = isDelete;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
