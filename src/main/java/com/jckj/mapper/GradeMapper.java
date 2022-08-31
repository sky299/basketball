package com.jckj.mapper;

import com.jckj.dto.PageDto;
import com.jckj.model.Grade;
import com.jckj.model.School;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: SkLily
 * @date: 2022/8/29 14:53
 * @description:
 */
public interface GradeMapper{

    /**
     * @param grade
     * @return List
     * 查询全部
     */

    public List<Grade> list(Grade grade);

    /**
     * @param grade
     * @return Integer
     * 查询全部
     */

    public Integer count(Grade grade);

    /**
     * @param grade
     * @return Integer
     * 添加
     */

    public Integer insert(Grade grade);

    /**
     * @param grade
     * @return Integer
     * 修改
     */

    public Integer update(Grade grade);

    /**
     * @param grade
     * @return Integer
     * 删除
     */

    public Integer delete(Grade grade);
}
