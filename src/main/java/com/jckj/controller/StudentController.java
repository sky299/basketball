package com.jckj.controller;

import com.jckj.model.TStudentInfo;
import com.jckj.service.StudentService;
import com.jckj.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("page/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("list")
    public JsonResult list(int page,int limit,TStudentInfo tStudentInfo) {
        tStudentInfo.setPageNum(page);
        tStudentInfo.setPageRow(limit);
        return JsonResult.success(studentService.list(tStudentInfo).getList(), studentService.count(tStudentInfo));
    }

//    @RequestMapping("info")
//    public JsonResult info(){
//        return JsonResult.success();
//    }
}
