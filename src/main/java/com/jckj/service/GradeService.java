package com.jckj.service;

import com.jckj.dto.PageDto;
import com.jckj.model.CourseInfo;
import com.jckj.model.Grade;
import com.jckj.model.TStudentInfo;
import com.jckj.vo.PageVo;

import java.util.Map;

/**
 * @author: SkLily
 * @date: 2022/8/29 15:02
 * @description:
 */
public interface GradeService {

    /**
     * 查询全部
     * @param grade
     * @return PageVo
     */

    public PageVo list(Grade grade);

    /**
     * 查询总条数
     * @param grade
     * @return Integer
     */

    public Integer count(Grade grade);
}
