package com.jckj.controller;

import com.jckj.model.OpenStyle;
import com.jckj.service.OpenStyleService;
import com.jckj.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 柳江
 * @date 2022/9/1 14:41
 * @describe:
 */
@RequestMapping("openstyle")
@RestController
public class OpenStyleController {

    @Autowired
    private OpenStyleService openStyleService;
    /**
     *风采信息列表
     * @param openStyle 风采对象
     * @return JsonResult封装数据
     */
    @RequestMapping("findAll")
    public JsonResult list(OpenStyle openStyle) {
        return JsonResult.success(openStyleService.list(openStyle).getList(),openStyleService.count(openStyle));
    }
    /**
     * 风采信息详情查询
     * @param openStyle 风采对象
     * @return JaonResult
     */
    @RequestMapping("findById")
    public JsonResult courseInfo(OpenStyle openStyle){
        return JsonResult.success(openStyleService.findById(openStyle));
    }

    /**
     * 风采信息批量删除和删除
     * @param id 风采id
     * @return JaonResult
     */
    @RequestMapping("delete")
    public JsonResult delete(String id){
        return JsonResult.success(openStyleService.delete(id));
    }

    /**
     * 风采信息修改
     * @param openStyle 风采信息对象
     * @param img 图片（风采信息照片）
     * @param videos 视频
     * @return JaonResult
     */
    @RequestMapping("update")
    public JsonResult update(OpenStyle openStyle, MultipartFile img,MultipartFile videos) {
        return JsonResult.success(openStyleService.update(openStyle,img,videos));
    }

    /**
     * 风采信息添加功能
     * @param openStyle 风采信息对象
     * @param img 图片
     * @param videos 视频
     * @return JaonResult
     */
    @RequestMapping("add")
    public JsonResult add(OpenStyle openStyle, MultipartFile img,MultipartFile videos) {
        return JsonResult.success(openStyleService.add(openStyle,img,videos));
    }
}
