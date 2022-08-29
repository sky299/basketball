package com.jckj.service;

import com.jckj.dto.PageDto;
import com.jckj.model.TStudentInfo;
import com.jckj.vo.PageVo;

public interface StudentService {

    /**
     * 列表
     */
    PageVo list(PageDto dto);
    /**
     * 详情
     */
    TStudentInfo info(Integer id);
    /**
     * 新增
     */
    void add(TStudentInfo tStudentInfo);
    /**
     * 修改
     */
    void update(TStudentInfo tStudentInfo);
    /**
     * 删除
     */
    void remove(Integer id);

    /**
     * 列表总数
     */
    Integer count(TStudentInfo tStudentInfo);
}
