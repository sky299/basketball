package com.jckj.mapper;

import com.jckj.dto.PageDto;
import com.jckj.model.CourseInfo;

import java.util.List;

public interface CourseInfoMapper {
    public List<CourseInfo> findAll(PageDto dto);
    public Integer count(CourseInfo courseInfo);
}
