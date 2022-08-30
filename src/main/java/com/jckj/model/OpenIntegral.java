package com.jckj.model;

import java.io.Serializable;

/**
 * @author 柳江
 * @since 2022-08-29
 */
public class OpenIntegral implements Serializable {

    private Integer id;

    /**
     * 积分获取方式
     */
    private String integralNumber;

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
