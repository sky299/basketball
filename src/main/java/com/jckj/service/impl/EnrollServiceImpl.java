package com.jckj.service.impl;

import com.jckj.mapper.EnrollMapper;
import com.jckj.model.Enroll;
import com.jckj.service.EnrollService;
import com.jckj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: SkLily
 * @date: 2022/8/29 15:05
 * @description:
 */
@Service
public class EnrollServiceImpl implements EnrollService {

    @Autowired
    private EnrollMapper enrollMapper;

    /**
     * 查询全部
     * @param enroll
     * @return PageVo
     */

    @Override
    public PageVo list(Enroll enroll) {
        return PageVo.successPage(enrollMapper.list(enroll));
    }

    /**
     * 查询总条数
     * @param enroll
     * @return Integer
     */

    @Override
    public Integer count(Enroll enroll) {
        return enrollMapper.count(enroll);
    }

    /**
     * 添加
     * @param enroll
     * @return Integer
     */

    @Override
    public Integer insert(Enroll enroll) {
        enroll.setCreateTime(System.currentTimeMillis());
        enroll.setUpdateTime(System.currentTimeMillis());
        Integer insert = enrollMapper.insert(enroll);
        return insert;
    }
}
