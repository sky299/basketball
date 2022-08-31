package com.jckj.controller;

import com.jckj.model.Enroll;
import com.jckj.service.EnrollService;
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
@RequestMapping("enroll")
@RestController
public class EnrollController {

    @Autowired
    private EnrollService enrollService;

    @RequestMapping("list")
    public JsonResult list(Enroll enroll) {
        return JsonResult.success(enrollService.list(enroll).getList(),enrollService.count(enroll));
    }
    @RequestMapping("insert")
    public Integer insert(Enroll enroll) throws IOException {
        Integer insert = enrollService.insert(enroll);
        return insert;
    }
}
