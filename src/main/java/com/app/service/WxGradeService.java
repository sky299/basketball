package com.app.service;

import com.jckj.model.Grade;

import java.util.List;

/**
 * @author: SkLily
 * @date: 2022/9/7 10:01
 * @description:
 */
public interface WxGradeService {

    /**
     * 根据校区查询全部班级列表
     * @param grade
     * @return List
     */

    public List<Grade> list(Grade grade);
}
