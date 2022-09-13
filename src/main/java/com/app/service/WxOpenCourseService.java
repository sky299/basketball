package com.app.service;

import com.jckj.model.OpenCourse;
import com.jckj.vo.PageVo;

import javax.servlet.http.HttpSession;

/**
 * @author 小江
 * @date 2022/9/13 16:27
 * @describe:
 */
public interface WxOpenCourseService {
    /**
     * 公开班级查询
     * @param openCourse 班级对象
     * @return 班级集合
     */
    PageVo list(OpenCourse openCourse, HttpSession session);
}
