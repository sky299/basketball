package com.jckj.service;

import com.jckj.model.CourseInfo;
import com.jckj.vo.PageVo;

public interface CourseInfoService {

    public PageVo list(CourseInfo courseInfo);

    public CourseInfo findById(Integer id);

    public int count(CourseInfo courseInfo);

    public int add(CourseInfo courseInfo);

    public int delete(Integer id);

    public int update(CourseInfo courseInfo);
}
