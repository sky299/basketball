package com.jckj.controller;

import com.jckj.model.OpenSchool;
import com.jckj.service.OpenSchoolService;
import com.jckj.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 柳江
 * @date 2022/9/2 13:52
 * @describe:
 */
@RequestMapping(value = "openSchool")
@RestController
public class OpenSchoolController {
    @Autowired
    private OpenSchoolService openSchoolService;

    /**
     * 公共校区查询全部
     * @param openSchool 公共校区
     * @return JaonResult
     */
    @RequestMapping("findAll")
    public JsonResult list(OpenSchool openSchool) {
        return JsonResult.success(openSchoolService.list(openSchool).getList(),openSchoolService.count(openSchool));
    }

    /**
     * 公共校区详情查询
     * @param openSchool 公共校区对象
     * @return JaonResult
     */
    @RequestMapping("findById")
    public JsonResult courseInfo(OpenSchool openSchool){
        return JsonResult.success(openSchoolService.findById(openSchool));
    }

    /**
     * 公共校区批量删除和删除
     * @param id 公共校区id
     * @return JaonResult
     */
    @RequestMapping("delete")
    public JsonResult delete(String id){
        return JsonResult.success(openSchoolService.delete(id));
    }

    /**
     * 公共校区修改
     * @param openSchool 公共校区对象
     * @param img 图片（课程照片）
     * @return JaonResult
     */
    @RequestMapping("update")
    public JsonResult update(OpenSchool openSchool, MultipartFile img) {
        return JsonResult.success(openSchoolService.update(openSchool,img));
    }

    /**
     * 公共校区添加功能
     * @param openSchool 公共校区对象
     * @param img 图片
     * @return JaonResult
     */
    @RequestMapping("add")
    public JsonResult add(OpenSchool openSchool, MultipartFile img) {
        return JsonResult.success(openSchoolService.add(openSchool,img));
    }
}
