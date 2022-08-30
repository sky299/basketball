package com.jckj.model;

/**
 * @author: SkLily
 * @date: 2022/8/30 9:33
 * @description:
 */
public class Enroll {
    /**
     *报名id
     */
    private Integer id;
    /**
     *学员姓名
     */
    private String studentName;
    /**
     *用户手机号
     */
    private String userPhone;
    /**
     *付款方式
     */
    private String pattern;
    /**
     *报名渠道
     */
    private String canal;
    /**
     *课程时间
     */
    private String classHour;
    /**
     *校区名
     */
    private String schoolName;
    /**
     *报名状态
     */
    private Boolean enrollState;
    /**
     *课时
     */
    private Integer courseHour;
    /**
     *课程名称
     */
    private String courseName;
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

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getClassHour() {
        return classHour;
    }

    public void setClassHour(String classHour) {
        this.classHour = classHour;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Boolean getEnrollState() {
        return enrollState;
    }

    public void setEnrollState(Boolean enrollState) {
        this.enrollState = enrollState;
    }

    public Integer getCourseHour() {
        return courseHour;
    }

    public void setCourseHour(Integer courseHour) {
        this.courseHour = courseHour;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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

    public Enroll() {
    }

    public Enroll(Integer id, String studentName, String userPhone, String pattern, String canal, String classHour, String schoolName, Boolean enrollState, Integer courseHour, String courseName, Boolean isDelete, Long createTime, Long updateTime) {
        this.id = id;
        this.studentName = studentName;
        this.userPhone = userPhone;
        this.pattern = pattern;
        this.canal = canal;
        this.classHour = classHour;
        this.schoolName = schoolName;
        this.enrollState = enrollState;
        this.courseHour = courseHour;
        this.courseName = courseName;
        this.isDelete = isDelete;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
