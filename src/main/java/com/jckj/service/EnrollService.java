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
     * @param enroll
     * @return List
     * 查询全部
     */

    public PageVo list(Enroll enroll);

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
