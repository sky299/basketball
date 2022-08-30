package com.jckj.mapper;

import com.jckj.dto.PageDto;
import com.jckj.model.TStudentInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    /**
     * 列表
     */
    List<TStudentInfo> list(TStudentInfo tStudentInfo);

    /**
     * 列表总数
     */
    Integer count(PageDto pageDto);

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
}
