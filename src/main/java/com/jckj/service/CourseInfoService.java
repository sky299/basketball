package com.jckj.service;

import com.jckj.model.CourseInfo;
import com.jckj.vo.PageVo;
import org.springframework.web.multipart.MultipartFile;

public interface CourseInfoService {

    public PageVo list(CourseInfo courseInfo);

    public CourseInfo findById(CourseInfo courseInfo);

    public int count(CourseInfo courseInfo);

    public int add(CourseInfo courseInfo, MultipartFile img);

    public int delete(String id);

    public int update(CourseInfo courseInfo, MultipartFile img);
}
