package com.jckj.controller;

import com.jckj.dto.PageDto;
import com.jckj.model.Grade;
import com.jckj.service.GradeService;
import com.jckj.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
