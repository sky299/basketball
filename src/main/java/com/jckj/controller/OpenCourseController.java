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

    /**
     * 公共课程查询全部
     * @param openCourse 公共课程对象
     * @return JaonResult
     */
    @RequestMapping("findAll")
    public JsonResult list(OpenCourse openCourse) {
        return JsonResult.success(opencourseInfoService.list(openCourse).getList(),opencourseInfoService.count(openCourse));
    }

    /**
     * 公共课程详情查询
     * @param openCourse 公共课程对象
     * @return JaonResult
     */
    @RequestMapping("findById")
    public JsonResult courseInfo(OpenCourse openCourse){
        return JsonResult.success(opencourseInfoService.findById(openCourse));
    }

    /**
     * 公共课程模块批量删除和删除
     * @param id 公共课程id
     * @return JaonResult
     */
    @RequestMapping("delete")
    public JsonResult delete(String id){
        return JsonResult.success(opencourseInfoService.delete(id));
    }

    /**
     * 公共课程表修改
     * @param openCourse 公共课程对象
     * @param img 公共图片（课程照片）
     * @return JaonResult
     */
    @RequestMapping("update")
    public JsonResult update(OpenCourse openCourse, MultipartFile img) {
        return JsonResult.success(opencourseInfoService.update(openCourse,img));
    }

    /**
     * 公共课程添加功能
     * @param openCourse 公共课程对象
     * @param img 公共图片
     * @return JaonResult
     */
    @RequestMapping("add")
    public JsonResult add(OpenCourse openCourse, MultipartFile img) {
        return JsonResult.success(opencourseInfoService.add(openCourse,img));
    }
}
