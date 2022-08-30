package com.jckj.model;

import java.io.Serializable;

/**
 * @author 柳江
 * @since 2022-08-29
 */
public class SaltsInfo implements Serializable {

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


}
