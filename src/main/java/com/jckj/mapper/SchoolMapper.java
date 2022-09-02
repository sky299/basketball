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
     * 查询全部
     * @param school
     * @return List
     */

    public List<School> list(School school);

    /**
     * 查询全部条数
     * @param school
     * @return Integer
     */

    public Integer count(School school);

    /**
     * 添加校区
     * @param school
     * @return Integer
     */

    public Integer insert(School school);

    /**
     * 修改校区
     * @param school
     * @return Integer
     */

    public Integer update(School school);

    /**
     * 删除校区
     * @param school
     * @return Integer
     */

    public Integer delete(School school);

    /**
     * 给公共校区模块
     * 查询全部
     * @param
     * @return List
     */

    public List<School> listOpenSchool();

    /**
     * 给公共校区模块
     * 根据校区名字查询
     * @param schoolName
     * @return List
     */

    public List<School> listFindBySchoolName(String schoolName);
}
