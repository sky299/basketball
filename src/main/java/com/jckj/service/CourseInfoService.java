package com.jckj.service;

import com.jckj.dto.PageDto;
import com.jckj.model.CourseInfo;
import com.jckj.vo.PageVo;

public interface CourseInfoService {
    public PageVo list(CourseInfo courseInfo);
    public Integer count(CourseInfo courseInfo);
}
