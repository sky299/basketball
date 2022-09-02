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
     * 查询全部
     * @param grade
     * @return List
     */

    public List<Grade> list(Grade grade);

    /**
     * 查询全部条数
     * @param grade
     * @return Integer
     */

    public Integer count(Grade grade);

    /**
     * 添加
     * @param grade
     * @return Integer
     */

    public Integer insert(Grade grade);

    /**
     * 修改
     * @param grade
     * @return Integer
     */

    public Integer update(Grade grade);

    /**
     * 删除
     * @param grade
     * @return Integer
     */

    public Integer delete(Grade grade);
}
