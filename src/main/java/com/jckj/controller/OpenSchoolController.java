package com.jckj.controller;

import com.jckj.model.OpenSchool;
import com.jckj.service.OpenSchoolService;
import com.jckj.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 柳江
 * @date 2022/9/2 13:52
 * @describe:
 */
@RequestMapping("openSchool")
@RestController
public class OpenSchoolController {

    @Autowired
    private OpenSchoolService openSchoolService;

    @RequestMapping("findAll")
    public JsonResult list(OpenSchool openSchool) {
        return JsonResult.success(openSchoolService.list(openSchool).getList(),openSchoolService.count(openSchool));
    }

    @RequestMapping("findById")
    public JsonResult courseInfo(OpenSchool openSchool){
        return JsonResult.success(openSchoolService.findById(openSchool));
    }

    @RequestMapping("delete")
    public JsonResult delete(String id){
        return JsonResult.success(openSchoolService.delete(id));
    }

    @RequestMapping("update")
    public JsonResult update(OpenSchool openSchool, MultipartFile img) {
        return JsonResult.success(openSchoolService.update(openSchool,img));
    }

    @RequestMapping("add")
    public JsonResult add(OpenSchool openSchool, MultipartFile img) {
        return JsonResult.success(openSchoolService.add(openSchool,img));
    }
}
