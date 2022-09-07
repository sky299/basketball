package com.app.controller;

import com.app.service.WxGradeService;
import com.app.vo.JsonResult;
import com.jckj.model.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: SkLily
 * @date: 2022/9/7 10:49
 * @description:
 */
@RequestMapping("wx")
@RestController
public class WxGradeController {
    @Autowired
    private WxGradeService wxGradeService;

    @RequestMapping("list")
    public JsonResult list(Grade grade){
        return JsonResult.success(wxGradeService.list(grade));
    }
}
