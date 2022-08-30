package com.jckj.controller;

import com.jckj.dto.PageDto;
import com.jckj.model.School;
import com.jckj.service.SchoolService;
import com.jckj.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author: SkLily
 * @date: 2022/8/29 15:45
 * @description:
 */
@RequestMapping("school")
@RestController
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @RequestMapping("list")
    public JsonResult list(School school) {
        return JsonResult.success(schoolService.list(school).getList(),schoolService.count(school));
    }
    @RequestMapping("insert")
    public Integer insert(School school, MultipartFile img) throws IOException {
        if (img != null) {
            // 设置图片路径
            String filename = img.getOriginalFilename();
            String filepath = "E://Picture//"+filename;
            // 转存图片
            img.transferTo(new File(filepath));
            school.setSchoolPhoto(filename);
        }
        Integer insert = schoolService.insert(school);
        return insert;
    }
}
