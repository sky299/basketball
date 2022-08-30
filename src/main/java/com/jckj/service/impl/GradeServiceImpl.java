package com.jckj.service.impl;

import com.jckj.dto.PageDto;
import com.jckj.mapper.GradeMapper;
import com.jckj.model.CourseInfo;
import com.jckj.model.Grade;
import com.jckj.service.GradeService;
import com.jckj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: SkLily
 * @date: 2022/8/29 15:05
 * @description:
 */
@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeMapper gradeMapper;

    /**
     * 查询全部
     * @param grade
     * @return PageVo
     */

    @Override
    public PageVo list(Grade grade) {
        return PageVo.successPage(gradeMapper.list(grade));
    }

    /**
     * 查询总条数
     * @param grade
     * @return Integer
     */

    @Override
    public Integer count(Grade grade) {
        return gradeMapper.count(grade);
    }
}
