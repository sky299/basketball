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
 * @describe:
 */
@RequestMapping("course")
@RestController
public class CourseController {

    @Autowired
    private CourseInfoService courseInfoService;

    /**
     * 课程查询全部
     * @param courseInfo 课程对象
     * @return JaonResult
     */
    @RequestMapping("findAll")
    public JsonResult list(CourseInfo courseInfo) {
        return JsonResult.success(courseInfoService.list(courseInfo).getList(),courseInfoService.count(courseInfo));
    }

    /**
     * 课程详情查询
     * @param courseInfo 课程对象
     * @return JaonResult
     */
    @RequestMapping("findById")
    public JsonResult courseInfo(CourseInfo courseInfo){
        return JsonResult.success(courseInfoService.findById(courseInfo));
    }

    /**
     * 课程模块批量删除和删除
     * @param id 课程id
     * @return JaonResult
     */
    @RequestMapping("delete")
    public JsonResult delete(String id){
        return JsonResult.success(courseInfoService.delete(id));
    }

    /**
     * 课程表修改
     * @param courseInfo 课程对象
     * @param img 图片（课程照片）
     * @return JaonResult
     */
    @RequestMapping("update")
    public JsonResult update(CourseInfo courseInfo, MultipartFile img) {
        return JsonResult.success(courseInfoService.update(courseInfo,img));
    }

    /**
     * 课程添加功能
     * @param courseInfo 课程对象
     * @param img 图片
     * @return JaonResult
     */
    @RequestMapping("add")
    public JsonResult add(CourseInfo courseInfo, MultipartFile img) {
        return JsonResult.success(courseInfoService.add(courseInfo,img));
    }
}
