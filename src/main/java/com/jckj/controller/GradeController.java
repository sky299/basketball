package com.jckj.controller;

import com.jckj.model.Grade;
import com.jckj.service.GradeService;
import com.jckj.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * @author: SkLily
 * @date: 2022/8/29 15:45
 * @description:
 */
@RequestMapping("grade")
@RestController
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @RequestMapping("list")
    public JsonResult list(Grade grade) {
        return JsonResult.success(gradeService.list(grade).getList(),gradeService.count(grade));
    }
    @RequestMapping("insert")
    public JsonResult insert(Grade grade, MultipartFile img){
        return JsonResult.success(gradeService.insert(grade,img));
    }

    @RequestMapping("update")
    public JsonResult insert(Grade grade){
        return JsonResult.success(gradeService.update(grade));
    }

    @RequestMapping("delete")
    public JsonResult delete(String id){
        return JsonResult.success(gradeService.delete(id));
    }

    @RequestMapping("deletemore")
    public JsonResult deletemore(String str){
        return JsonResult.success(gradeService.delete(str));
    }
}
