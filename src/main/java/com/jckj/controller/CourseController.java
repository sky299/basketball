package com.jckj.controller;

import com.jckj.model.CourseInfo;
import com.jckj.service.CourseInfoService;
import com.jckj.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
     * 课程列表
     */
    @RequestMapping("findAll")
    public JsonResult list(CourseInfo courseInfo) {
        JsonResult success = JsonResult.success(courseInfoService.list(courseInfo).getList(), courseInfoService.count(courseInfo));
        return JsonResult.success(courseInfoService.list(courseInfo).getList(),courseInfoService.count(courseInfo));
    }

    /**
     * @param id 课程id
     * @return 根据课程id查询到的课程对象
     */
    @RequestMapping("findById")
    public JsonResult courseInfo(Integer id){
        return JsonResult.success(courseInfoService.findById(id));
    }

}
