package com.jckj.model;

import com.jckj.dto.PageDto;

import java.io.Serializable;

/**
 * @author 柳江
 * @since 2022-08-29
 */
public class OpenSchool extends PageDto implements Serializable {

    /**
     * 信息校区
     */
    private Integer id;

    /**
     * 校区名称
     */
    private String schoolName;

    /**
     * 描述
     */
    private String describe;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    /**
     * 是否展示（0-否，1-是）
     */
    private Boolean isShow;

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
    /**
     * 校区照片
     */
    private String schoolPhoto;

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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getShow() {
        return isShow;
    }

    public void setShow(Boolean show) {
        isShow = show;
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

    public String getSchoolPhoto() {
        return schoolPhoto;
    }

    public void setSchoolPhoto(String schoolPhoto) {
        this.schoolPhoto = schoolPhoto;
    }

    public OpenSchool(Integer id, String schoolName, String describe, String phone, String address, Boolean isShow, Boolean isDelete, Long createTime, Long updateTime, String schoolPhoto) {
        this.id = id;
        this.schoolName = schoolName;
        this.describe = describe;
        this.phone = phone;
        this.address = address;
        this.isShow = isShow;
        this.isDelete = isDelete;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.schoolPhoto = schoolPhoto;
    }

    public OpenSchool() {
    }
}
