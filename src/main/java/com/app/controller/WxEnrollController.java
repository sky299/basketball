package com.app.controller;

import com.app.service.WxEnrollService;
import com.app.vo.JsonResult;
import com.jckj.model.Enroll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("enroll")
public class WxEnrollController {

    @Autowired
    private WxEnrollService wxEnrollService;

    @PostMapping("list")
    public JsonResult list(Enroll enroll){
        return JsonResult.success(wxEnrollService.list(enroll).getList());
    }

    @PostMapping("insert")
    public JsonResult insert(Enroll enroll){
        wxEnrollService.insert(enroll);
        return JsonResult.success();
    }

    @PostMapping("signUp")
    public JsonResult signUp(Enroll enroll){
        return JsonResult.success(wxEnrollService.signUp(enroll));
    }
}
