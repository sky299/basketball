package com.jckj.model;

import com.jckj.dto.PageDto;

import java.io.Serializable;

/**
 * @author 柳江
 * @since 2022-08-29
 */
public class OpenStyle extends PageDto implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 学员姓名
     */
    private String studentName;

    /**
     * 所属校区
     */
    private String schoolName;

    /**
     * 学员风采图片
     */
    private String picture;

    /**
     * 学员风采视频
     */
    private String video;

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

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
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

    public OpenStyle(Integer id, String studentName, String schoolName, String picture, String video, Boolean shows, Boolean isDelete, Long createTime, Long updateTime) {
        this.id = id;
        this.studentName = studentName;
        this.schoolName = schoolName;
        this.picture = picture;
        this.video = video;
        this.shows = shows;
        this.isDelete = isDelete;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public OpenStyle() {
    }
}
