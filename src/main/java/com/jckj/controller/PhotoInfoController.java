package com.jckj.controller;

import com.jckj.model.CourseInfo;
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

    /**
     * 查询关于我们
     * @return JaonResult
     */
    @RequestMapping("findAll")
    public JsonResult list() {
        return JsonResult.success(photoInfoService.list().getList(),photoInfoService.count());
    }

    /**
     * 修改公共休息关于我们
     * @param photoInfo 关于我们实体对象
     * @param img 图片
     * @return 成功条数
     */
    @RequestMapping("update")
    public JsonResult update(PhotoInfo photoInfo, MultipartFile img){
        return JsonResult.success(photoInfoService.update(photoInfo, img));
    }
}
