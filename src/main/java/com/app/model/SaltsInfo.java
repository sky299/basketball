package com.app.model;

import com.app.dto.PageDto;

import java.io.Serializable;

/**
 * @author 柳江
 * @since 2022-08-29
 */
public class SaltsInfo extends PageDto implements Serializable {

    /**
     * 销课表
     */
    private Integer id;

    /**
     * 学员姓名
     */
    private String studentName;

    /**
     * 销课时间
     */
    private Long saltsTime;

    /**
     * 销课原因
     */
    private String saltsCause;

    /**
     * 销课类型(0销课,1加课)
     */
    private Boolean saltsType;

    /**
     * 是否删除(0未删除，1已删除)
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
     * 销课人（校区加教练名）
     */
    private String saltsName;

    /**
     * 学生id
     */
   private Integer studentId;

    public SaltsInfo(Integer id, String studentName, Long saltsTime, String saltsCause, Boolean saltsType, Boolean isDelete, Long createTime, Long updateTime, String saltsName,Integer studentId) {
        this.id = id;
        this.studentName = studentName;
        this.saltsTime = saltsTime;
        this.saltsCause = saltsCause;
        this.saltsType = saltsType;
        this.isDelete = isDelete;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.saltsName = saltsName;
        this.studentId = studentId;
    }

    public SaltsInfo() {
    }

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

    public Long getSaltsTime() {
        return saltsTime;
    }

    public void setSaltsTime(Long saltsTime) {
        this.saltsTime = saltsTime;
    }

    public String getSaltsCause() {
        return saltsCause;
    }

    public void setSaltsCause(String saltsCause) {
        this.saltsCause = saltsCause;
    }

    public Boolean getSaltsType() {
        return saltsType;
    }

    public void setSaltsType(Boolean saltsType) {
        this.saltsType = saltsType;
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

    public String getSaltsName() {
        return saltsName;
    }

    public void setSaltsName(String saltsName) {
        this.saltsName = saltsName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}
