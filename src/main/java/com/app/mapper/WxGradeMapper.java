package com.app.mapper;

import com.jckj.model.Grade;

import java.util.List;

/**
 * @author: SkLily
 * @date: 2022/9/7 9:47
 * @description:
 */
public interface WxGradeMapper {

    /**
     * 根据校区查询全部班级列表
     * @param grade
     * @return List
     */

    public List<Grade> list(Grade grade);

    /**
     * 新增班级
     * @param grade
     * @return Integer
     */

    public Integer insert(Grade grade);

}
