package com.jckj.controller;

import com.jckj.model.Mien;
import com.jckj.service.MienService;
import com.jckj.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author: SkLily
 * @date: 2022/8/29 15:45
 * @description:
 */
@RequestMapping("mien")
@RestController
public class MienController {

    @Autowired
    private MienService mienService;

    @RequestMapping("list")
    public JsonResult list(Mien mien) {
        return JsonResult.success(mienService.list(mien).getList(),mienService.count(mien));
    }
    @RequestMapping("insert")
    public JsonResult insert(Mien mien, MultipartFile img,MultipartFile video){
        return JsonResult.success(mienService.insert(mien,img,video));
    }

    @RequestMapping("update")
    public JsonResult update(Mien mien,MultipartFile img,MultipartFile video){
        return JsonResult.success(mienService.update(mien,img,video));
    }

    @RequestMapping("delete")
    public JsonResult delete(String id){
        return JsonResult.success(mienService.delete(id));
    }

    @RequestMapping("deletemore")
    public JsonResult deletemore(String str){
        return JsonResult.success(mienService.delete(str));
    }
}
