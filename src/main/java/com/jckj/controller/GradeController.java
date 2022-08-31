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
    public Integer insert(Grade grade, MultipartFile img) throws IOException {
        if (img != null) {
            // 设置图片路径
            String filename = img.getOriginalFilename();
            String filepath = "E://Picture//g//"+filename;
            // 转存图片
            img.transferTo(new File(filepath));
            grade.setGradePhoto(filename);
        }
        Integer insert = gradeService.insert(grade);
        return insert;
    }

    @RequestMapping("update")
    public Integer insert(Grade grade){
        Integer update = gradeService.update(grade);
        return update;
    }

    @RequestMapping("delete")
    public Integer delete(Grade grade){
        Integer delete = gradeService.delete(grade);
        return delete;
    }

    @RequestMapping("deletemore")
    public Integer deletemore(String str){
        Integer delete = 0;
        String[] strs = str.split(",");
        for (String s : strs) {
            Grade grade = new Grade();
            grade.setId(Integer.parseInt(s));
            delete += gradeService.delete(grade);
        }
        return delete;
    }
}
