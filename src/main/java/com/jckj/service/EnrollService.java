package com.jckj.service;

import com.jckj.model.Enroll;
import com.jckj.vo.PageVo;

/**
 * @author: SkLily
 * @date: 2022/8/29 15:02
 * @description:
 */
public interface EnrollService {

    /**
     * 查询全部
     * @param enroll
     * @return List
     */

    public PageVo list(Enroll enroll);

    /**
     * 查询全部
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
