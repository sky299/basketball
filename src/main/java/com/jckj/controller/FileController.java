package com.jckj.controller;

import com.jckj.service.FileService;
import com.jckj.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author: SkLily
 * @date: 2022/8/29 15:45
 * @description:
 */
@RequestMapping("file")
@RestController
public class FileController {

    @Autowired
    private FileService fileService;

    @RequestMapping("upload")
    public JsonResult uploadFile(MultipartFile file) {
        return JsonResult.success(fileService.uploadFile(file));
    }
}
