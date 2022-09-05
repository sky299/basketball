package com.jckj.controller;

import com.jckj.model.SaltsInfo;
import com.jckj.service.SaltsService;
import com.jckj.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author 柳江
 * @date 2022/9/1 10:37
 * @describe: 销课模块
 */
@RequestMapping("salts")
@RestController
public class SaltsController {
    @Autowired
    private SaltsService saltsService;

    @RequestMapping("findAll")
    public JsonResult list(SaltsInfo saltsInfo) {
        return JsonResult.success(saltsService.list(saltsInfo).getList(),saltsService.count(saltsInfo));
    }
}
