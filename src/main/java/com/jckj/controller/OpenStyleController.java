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

    @RequestMapping("findAll")
    public JsonResult list(OpenStyle openStyle) {
        return JsonResult.success(openStyleService.list(openStyle).getList(),openStyleService.count(openStyle));
    }

    @RequestMapping("findById")
    public JsonResult courseInfo(OpenStyle openStyle){
        return JsonResult.success(openStyleService.findById(openStyle));
    }

    @RequestMapping("delete")
    public JsonResult delete(String id){
        return JsonResult.success(openStyleService.delete(id));
    }

    @RequestMapping("update")
    public JsonResult update(OpenStyle openStyle, MultipartFile img,MultipartFile videos) {
        return JsonResult.success(openStyleService.update(openStyle,img,videos));
    }

    @RequestMapping("add")
    public JsonResult add(OpenStyle openStyle, MultipartFile img,MultipartFile videos) {
        return JsonResult.success(openStyleService.add(openStyle,img,videos));
    }
}
