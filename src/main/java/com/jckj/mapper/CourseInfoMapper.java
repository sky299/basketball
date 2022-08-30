package com.jckj.mapper;

import com.jckj.dto.PageDto;
import com.jckj.model.CourseInfo;

import java.util.List;

public interface CourseInfoMapper {

    public List<CourseInfo> findAll(CourseInfo courseInfo);

    public CourseInfo findById(Integer id);

    public Integer count(CourseInfo courseInfo);

    public int add(CourseInfo courseInfo);

    public int delete(Integer id);

    public int update(CourseInfo courseInfo);

}