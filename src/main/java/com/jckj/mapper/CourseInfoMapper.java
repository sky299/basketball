package com.jckj.mapper;

import com.jckj.model.CourseInfo;

import java.util.List;

public interface CourseInfoMapper {

    public List<CourseInfo> findAll(CourseInfo courseInfo);

    public CourseInfo findById(CourseInfo courseInfo);

    public Integer count(CourseInfo courseInfo);

    public int add(CourseInfo courseInfo);

    public int delete(CourseInfo courseInfo);

    public int update(CourseInfo courseInfo);

}