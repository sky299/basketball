package com.app.controller;

import com.app.service.AppSaltsService;
import com.jckj.model.SaltsInfo;
import com.jckj.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小江
 * @date 2022/9/6 16:52
 * @describe:
 */
@RequestMapping("appSaltsInfo")
@RestController
public class AppSaltsInfoController {
    @Autowired
    private AppSaltsService appSaltsService;
    @RequestMapping("findAll")
    public JsonResult list(SaltsInfo saltsInfo) {
//        return JsonResult.success(appSaltsService.list(saltsInfo).getList(),appSaltsService.count(saltsInfo));
        return JsonResult.success("haahahha");
    }
}
