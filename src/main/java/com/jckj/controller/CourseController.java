package com.jckj.controller;

import com.jckj.model.CourseInfo;
import com.jckj.service.CourseInfoService;
import com.jckj.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 柳江
 * @date 2022/8/29 15:26
 * @describe: 课程模块
 */
@RequestMapping("course")
@RestController
public class CourseController {

    @Autowired
    private CourseInfoService courseInfoService;

    @RequestMapping("findAll")
    public JsonResult list(CourseInfo courseInfo) {
        return JsonResult.success(courseInfoService.list(courseInfo).getList(),courseInfoService.count(courseInfo));
    }

    @RequestMapping("findById")
    public JsonResult courseInfo(CourseInfo courseInfo){
        return JsonResult.success(courseInfoService.findById(courseInfo));
    }

    @RequestMapping("delete")
    public JsonResult delete(String id){
        return JsonResult.success(courseInfoService.delete(id));
    }

    @RequestMapping("update")
    public JsonResult update(CourseInfo courseInfo, MultipartFile img) {
        return JsonResult.success(courseInfoService.update(courseInfo,img));
    }

    @RequestMapping("add")
    public JsonResult add(CourseInfo courseInfo, MultipartFile img) {
        return JsonResult.success(courseInfoService.add(courseInfo,img));
    }
}
