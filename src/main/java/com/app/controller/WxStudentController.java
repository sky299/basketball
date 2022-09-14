package com.app.controller;

import com.app.service.WxStudentService;
import com.app.service.WxUserStudentService;
import com.app.vo.JsonResult;
import com.jckj.model.TStudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wx/student")
public class WxStudentController {

    @Autowired
    private WxStudentService wxStudentService;

    @Autowired
    private WxUserStudentService wxUserStudentService;

    @PostMapping("list")
    public JsonResult list(TStudentInfo tStudentInfo){
        return JsonResult.success(wxStudentService.list(tStudentInfo).getList());
    }

    @PostMapping("info")
    public JsonResult info(String studentId){
        return JsonResult.success(wxStudentService.info(studentId));
    }

    @PostMapping("findByUserPhone")
    public JsonResult findByUserPhone(String userPhone){
        return JsonResult.success(wxUserStudentService.findByUserPhone(userPhone));
    }

    @PostMapping("update")
    public JsonResult update(TStudentInfo tStudentInfo){
        wxStudentService.update(tStudentInfo);
        return JsonResult.success();
    }
}
