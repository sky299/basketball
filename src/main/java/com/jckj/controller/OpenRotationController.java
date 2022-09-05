package com.jckj.controller;

import com.jckj.model.OpenRotation;
import com.jckj.service.OpenRotationService;
import com.jckj.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 柳江
 * @date 2022/9/2 13:07
 * @describe:
 */
@RequestMapping("openRotation")
@RestController
public class OpenRotationController {
    @Autowired
    private OpenRotationService openRotationService;

    @RequestMapping("findAll")
    public JsonResult list(OpenRotation openProblem) {
        return JsonResult.success(openRotationService.list(openProblem).getList(),openRotationService.count());
    }

    @RequestMapping("findById")
    public JsonResult courseInfo(OpenRotation openProblem){
        return JsonResult.success(openRotationService.findById(openProblem));
    }

    @RequestMapping("delete")
    public JsonResult delete(String id){
        return JsonResult.success(openRotationService.delete(id));
    }

    @RequestMapping("update")
    public JsonResult update(OpenRotation openProblem, MultipartFile img) {
        return JsonResult.success(openRotationService.update(openProblem,img));
    }

    @RequestMapping("add")
    public JsonResult add(OpenRotation openProblem, MultipartFile img) {
        return JsonResult.success(openRotationService.add(openProblem,img));
    }
}
