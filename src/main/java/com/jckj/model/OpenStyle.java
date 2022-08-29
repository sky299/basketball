package com.jckj.model;

import java.io.Serializable;

/**
 * @author 柳江
 * @since 2022-08-29
 */
public class OpenStyle implements Serializable {


    /**
     * 主键
     */
    private Integer id;

    /**
     * 学员id
     */
    private Integer studentId;

    /**
     * 所属校区
     */
    private Integer schoolId;

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
