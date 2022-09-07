package com.app.controller;

import com.app.service.WxStudentService;
import com.app.vo.JsonResult;
import com.jckj.model.TStudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class WxStudentController {

    @Autowired
    private WxStudentService wxStudentService;

    @PostMapping("list")
    public JsonResult list(TStudentInfo tStudentInfo){
        return JsonResult.success(wxStudentService.list(tStudentInfo));
    }
}
