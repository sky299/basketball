package com.app.service.impl;

import com.app.mapper.WxGradeMapper;
import com.app.service.WxGradeService;
import com.jckj.model.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: SkLily
 * @date: 2022/9/7 10:02
 * @description:
 */
@Service
public class WxGradeServiceImpl implements WxGradeService {

    @Autowired
    private WxGradeMapper wxGradeMapper;

    /**
     * 根据校区查询全部班级列表
     * @param grade
     * @return List
     */

    @Override
    public List<Grade> list(Grade grade) {
        return wxGradeMapper.list(grade);
    }
}
