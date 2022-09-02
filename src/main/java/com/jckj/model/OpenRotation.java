package com.jckj.model;

import com.jckj.dto.PageDto;

import java.io.Serializable;

/**
 * @author 柳江
 * @since 2022-08-29
 */
public class OpenRotation extends PageDto implements Serializable {

    private Integer id;

    /**
     * 轮播图
     */
    private String schoolPhoto;

    /**
     * 是否展示（0-否，1-是）
     */
    private Boolean shows;

    /**
     * 是否删除（0-否，1-是）
     */
    private Boolean isDelete;

    /**
     * 轮播顺序
     */
    private Integer sequence;

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

    public String getSchoolPhoto() {
        return schoolPhoto;
    }

    public void setSchoolPhoto(String schoolPhoto) {
        this.schoolPhoto = schoolPhoto;
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

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
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

    public OpenRotation(Integer id, String schoolPhoto, Boolean shows, Boolean isDelete, Integer sequence, Long createTime, Long updateTime) {
        this.id = id;
        this.schoolPhoto = schoolPhoto;
        this.shows = shows;
        this.isDelete = isDelete;
        this.sequence = sequence;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public OpenRotation() {
    }
}
