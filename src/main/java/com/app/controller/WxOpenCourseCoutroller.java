package com.app.controller;

import com.app.service.WxOpenCourseService;
import com.jckj.model.OpenCourse;
import com.jckj.vo.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author 小江
 * @date 2022/9/13 16:15
 * @describe:
 */
@RequestMapping("wxOpwnCourse")
@RestController
public class WxOpenCourseCoutroller {
    @Resource
    private WxOpenCourseService WxCourseService;

    @RequestMapping("findAll")
    public JsonResult findAllByStuId(OpenCourse openCourse, HttpSession session) {
        return JsonResult.success(WxCourseService.list(openCourse,session).getList());
    }
}
