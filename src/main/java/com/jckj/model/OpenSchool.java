package com.jckj.model;

import java.io.Serializable;

/**
 * @author 柳江
 * @since 2022-08-29
 */
public class OpenSchool implements Serializable {

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


}
