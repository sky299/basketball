package com.jckj.controller;

import com.jckj.model.TStudentInfo;
import com.jckj.service.StudentService;
import com.jckj.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

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
    public JsonResult add(TStudentInfo tStudentInfo,@RequestParam("photo") MultipartFile photo) throws IOException {
        if (photo != null) {
            String photoName = UUID.randomUUID() + "_" + photo.getOriginalFilename();
            int hashCode = photo.hashCode();
            String dir = Integer.toHexString(hashCode);
            String path = "E:/upload/" + dir.charAt(0) + "/" + dir.charAt(1) + "/" + photoName;
            photo.transferTo(new File(path));
            tStudentInfo.setStudentPhoto(dir.charAt(0) + "/" + dir.charAt(1) + "/" + photoName);
        }
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
}
