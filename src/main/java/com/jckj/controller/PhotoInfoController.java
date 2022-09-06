package com.jckj.controller;

import com.jckj.model.PhotoInfo;
import com.jckj.service.PhotoInfoService;
import com.jckj.vo.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * @author 柳江
 * @date 2022/8/31 16:23
 * @describe: 公共模块
 */
@RequestMapping("photoInfo")
@RestController
public class PhotoInfoController {

    @Resource
    private PhotoInfoService photoInfoService;

    @RequestMapping("findAll")
    public JsonResult list() {
        return JsonResult.success(photoInfoService.list().getList(),photoInfoService.count());
    }

    @RequestMapping("update")
    public JsonResult update(PhotoInfo photoInfo, MultipartFile img){
        return JsonResult.success(photoInfoService.update(photoInfo, img));
    }

}
