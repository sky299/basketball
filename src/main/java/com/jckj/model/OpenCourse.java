package com.jckj.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 柳江
 * @since 2022-08-29
 */
public class OpenCourse implements Serializable {

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
    private String describe;

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


}
