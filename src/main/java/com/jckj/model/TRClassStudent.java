package com.jckj.model;

public class TRClassStudent {

    private Integer id;

    private String studentId;

    private String classId;

    private Integer studentCourseNum;

    private Boolean classStatus;

    private Boolean isDelete;

    private Long createTime;

    private Long updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public Integer getStudentCourseNum() {
        return studentCourseNum;
    }

    public void setStudentCourseNum(Integer studentCourseNum) {
        this.studentCourseNum = studentCourseNum;
    }

    public Boolean getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(Boolean classStatus) {
        this.classStatus = classStatus;
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
}