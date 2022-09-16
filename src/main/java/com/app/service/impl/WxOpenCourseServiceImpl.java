package com.app.service.impl;

import com.app.mapper.WxOpenCourseMapper;
import com.app.service.WxOpenCourseService;
import com.jckj.model.OpenCourse;
import com.jckj.vo.PageVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 小江
 * @date 2022/9/13 16:28
 * @describe:
 */
@Service
public class WxOpenCourseServiceImpl implements WxOpenCourseService {
    @Resource
    private WxOpenCourseMapper wxCourseMapper;
    @Override
    public PageVo list(OpenCourse openCourse, HttpSession session) {
        String school = (String) session.getAttribute("school");
//        openCourse.setSchoolName(school);
        List<OpenCourse> all = wxCourseMapper.findAll(openCourse);
        return PageVo.successPage(all);
    }
}
