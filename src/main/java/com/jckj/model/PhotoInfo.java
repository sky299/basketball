package com.jckj.model;

import com.jckj.dto.PageDto;

import java.io.Serializable;

/**
 * @author 柳江
 * @since 2022-08-29
 */
public class PhotoInfo extends PageDto implements Serializable {

    /**
     * 关于我们id
     */
    private Integer id;

    /**
     * 关于我们
     */
    private String about;

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


}
