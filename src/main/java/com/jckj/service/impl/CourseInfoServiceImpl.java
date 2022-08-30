package com.jckj.service.impl;

import com.jckj.dto.PageDto;
import com.jckj.mapper.CourseInfoMapper;
import com.jckj.model.CourseInfo;
import com.jckj.service.CourseInfoService;
import com.jckj.vo.PageVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 柳江
 * @date 2022/8/29 15:39
 * @describe:
 */
@Service
public class CourseInfoServiceImpl implements CourseInfoService {
    @Resource
    private CourseInfoMapper courseInfoMapper;

    @Override
    public PageVo list(CourseInfo courseInfo) {
        List<CourseInfo> listCourseInfo = courseInfoMapper.findAll(courseInfo);
        PageVo pageVo = PageVo.successPage(listCourseInfo);
        return pageVo;
    }

    @Override
    public Integer count(CourseInfo courseInfo) {
        return courseInfoMapper.count(courseInfo);
    }
}
