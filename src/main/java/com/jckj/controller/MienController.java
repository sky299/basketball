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
    public Integer insert(Mien mien, MultipartFile img,MultipartFile video) throws IOException {
        if (img != null) {
            // 设置图片路径
            String filename = img.getOriginalFilename();
            String filepath = "E://Picture//g//"+filename;
            // 转存图片
            img.transferTo(new File(filepath));
            mien.setMienPhoto(filename);
        }
        if (video != null) {
            // 设置视频路径
            String filename = video.getOriginalFilename();
            String filepath = "E://Picture//g//"+filename;
            // 转存视频
            video.transferTo(new File(filepath));
            mien.setMienVideo(filename);
        }
        Integer insert = mienService.insert(mien);
        return insert;
    }

    @RequestMapping("update")
    public Integer update(Mien mien,MultipartFile img,MultipartFile video) throws IOException {
        if (img != null) {
            // 设置图片路径
            String filename = img.getOriginalFilename();
            String filepath = "E://Picture//g//"+filename;
            // 转存图片
            img.transferTo(new File(filepath));
            mien.setMienPhoto(filename);
        }
        if (video != null) {
            // 设置视频路径
            String filename = video.getOriginalFilename();
            String filepath = "E://Picture//g//"+filename;
            // 转存视频
            video.transferTo(new File(filepath));
            mien.setMienVideo(filename);
        }
        Integer update = mienService.update(mien);
        return update;
    }

    @RequestMapping("delete")
    public Integer delete(Mien mien){
        Integer delete = mienService.delete(mien);
        return delete;
    }

    @RequestMapping("deletemore")
    public Integer deletemore(String str){
        Integer delete = 0;
        String[] strs = str.split(",");
        for (String s : strs) {
            Mien mien = new Mien();
            mien.setId(Integer.parseInt(s));
            delete += mienService.delete(mien);
        }
        return delete;
    }
}
