package com.jckj.service;

import com.jckj.dto.PageDto;
import com.jckj.model.CourseInfo;
import com.jckj.vo.PageVo;

public interface CourseInfoService {
    public PageVo list(PageDto dto);
    public Integer count(CourseInfo courseInfo);
}
