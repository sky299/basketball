package com.jckj.mapper;

import com.jckj.dto.PageDto;
import com.jckj.model.Grade;
import com.jckj.model.School;

import java.util.List;

/**
 * @author: SkLily
 * @date: 2022/8/29 18:01
 * @description:
 */
public interface SchoolMapper {

    /**
     * @param school
     * @return List
     * 查询全部
     */

    public List<School> list(School school);

    /**
     * @param school
     * @return Integer
     * 查询全部
     */

    public Integer count(School school);

    /**
     * @param school
     * @return Integer
     * 添加
     */

    public Integer insert(School school);

    /**
     * @param school
     * @return Integer
     * 修改
     */

    public Integer update(School school);

    /**
     * @param school
     * @return Integer
     * 删除
     */

    public Integer delete(School school);
}
