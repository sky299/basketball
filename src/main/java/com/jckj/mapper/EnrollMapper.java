package com.jckj.mapper;

import com.jckj.model.Enroll;

import java.util.List;

/**
 * @author: SkLily
 * @date: 2022/8/29 14:53
 * @description:
 */
public interface EnrollMapper {

    /**
     * 查询全部
     * @param enroll
     * @return List
     */

    public List<Enroll> list(Enroll enroll);

    /**
     * 查询全部条数
     * @param enroll
     * @return Integer
     */

    public Integer count(Enroll enroll);

    /**
     * 添加
     * @param enroll
     * @return Integer
     */

    public Integer insert(Enroll enroll);
}
