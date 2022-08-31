package com.jckj.service;

import com.jckj.dto.PageDto;
import com.jckj.model.CourseInfo;
import com.jckj.model.Grade;
import com.jckj.model.School;
import com.jckj.vo.PageVo;

/**
 * @author: SkLily
 * @date: 2022/8/29 15:02
 * @description:
 */
public interface SchoolService {

    /**
     * 查询全部
     * @param school
     * @return PageVo
     */

    public PageVo list(School school);

    /**
     * 查询总条数
     * @param school
     * @return Integer
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
