package com.jckj.service.impl;

import com.jckj.dto.PageDto;
import com.jckj.mapper.SchoolMapper;
import com.jckj.model.CourseInfo;
import com.jckj.model.School;
import com.jckj.service.SchoolService;
import com.jckj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: SkLily
 * @date: 2022/8/29 15:05
 * @description:
 */
@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolMapper schoolMapper;

    /**
     * 查询全部
     * @param school
     * @return PageVo
     */

    @Override
    public PageVo list(School school) {
        return PageVo.successPage(schoolMapper.list(school));
    }

    /**
     * 查询总条数
     * @param school
     * @return Integer
     */

    @Override
    public Integer count(School school) {
        return schoolMapper.count(school);
    }
}
