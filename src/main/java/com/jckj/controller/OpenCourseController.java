package com.jckj.controller;

import com.jckj.model.OpenCourse;
import com.jckj.service.OpenCourseInfoService;
import com.jckj.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 柳江
 * @date 2022/9/2 13:51
 * @describe:
 */
@RequestMapping("openCourse")
@RestController
public class OpenCourseController {

    @Autowired
    private OpenCourseInfoService opencourseInfoService;

    @RequestMapping("findAll")
    public JsonResult list(OpenCourse openCourse) {
        return JsonResult.success(opencourseInfoService.list(openCourse).getList(),opencourseInfoService.count(openCourse));
    }

    @RequestMapping("findById")
    public JsonResult courseInfo(OpenCourse openCourse){
        return JsonResult.success(opencourseInfoService.findById(openCourse));
    }

    @RequestMapping("delete")
    public JsonResult delete(String id){
        return JsonResult.success(opencourseInfoService.delete(id));
    }

    @RequestMapping("update")
    public JsonResult update(OpenCourse openCourse, MultipartFile img) {
        return JsonResult.success(opencourseInfoService.update(openCourse,img));
    }

    @RequestMapping("add")
    public JsonResult add(OpenCourse openCourse, MultipartFile img) {
        return JsonResult.success(opencourseInfoService.add(openCourse,img));
    }
}
