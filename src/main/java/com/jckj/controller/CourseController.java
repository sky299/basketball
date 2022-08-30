package com.jckj.controller;

import com.jckj.dto.PageDto;
import com.jckj.model.CourseInfo;
import com.jckj.service.CourseInfoService;
import com.jckj.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 柳江
 * @date 2022/8/29 15:26
 * @describe:
 */
@RequestMapping("course")
@RestController
public class CourseController {

    @Autowired
    private CourseInfoService courseInfoService;

    /**
     * 列表
     */
    @RequestMapping("findAll")
    public JsonResult list(CourseInfo courseInfo) {
        return JsonResult.success(courseInfoService.list(courseInfo).getList(),courseInfoService.count(courseInfo));
    }

}
