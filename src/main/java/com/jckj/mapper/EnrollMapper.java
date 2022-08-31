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
     * @param enroll
     * @return List
     * 查询全部
     */

    public List<Enroll> list(Enroll enroll);

    /**
     * @param enroll
     * @return Integer
     * 查询全部
     */

    public Integer count(Enroll enroll);

    /**
     * @param enroll
     * @return Integer
     * 添加
     */

    public Integer insert(Enroll enroll);
}
