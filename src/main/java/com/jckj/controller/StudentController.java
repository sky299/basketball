package com.jckj.controller;

import com.jckj.conf.QiniuFile;
import com.jckj.model.TStudentInfo;
import com.jckj.service.StudentService;
import com.jckj.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("page/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("list")
    public JsonResult list(TStudentInfo tStudentInfo) {
        return JsonResult.success(studentService.list(tStudentInfo).getList(),studentService.count(tStudentInfo));
    }

    @RequestMapping("info")
    public JsonResult info(Integer id){
        return JsonResult.success(studentService.info(id));
    }

    @PostMapping("add")
    public JsonResult add(TStudentInfo tStudentInfo, @RequestParam("photo") MultipartFile photo) throws IOException {
        tStudentInfo.setStudentPhoto(QiniuFile.loadFile(photo.getBytes()));
        studentService.add(tStudentInfo);
        return JsonResult.success();
    }

    @PostMapping("update")
    public JsonResult update(@RequestBody TStudentInfo tStudentInfo) throws IOException {
        studentService.update(tStudentInfo);
        return JsonResult.success();
    }

    @PostMapping("remove")
    public JsonResult remove(Integer id){
        studentService.remove(id);
        return JsonResult.success();
    }

    @PostMapping("bathDelete")
    public JsonResult bathDelete(String id){
        String[] split = id.split(",");
        for (String s : split) {
            studentService.remove(Integer.parseInt(s));
        }
        return JsonResult.success();
    }
}
