package com.jckj.mapper;

import com.jckj.dto.PageDto;
import com.jckj.model.Grade;
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

}
