package com.jckj.model;

import java.io.Serializable;

/**
 * @author 柳江
 * @since 2022-08-29
 */
public class OpenRotation implements Serializable {

    private Integer id;

    /**
     * 轮播图
     */
    private String schoolPhoto;

    /**
     * 是否展示（0-否，1-是）
     */
    private Boolean isShow;

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


}
