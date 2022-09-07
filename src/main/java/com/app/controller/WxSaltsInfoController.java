package com.app.controller;

import com.app.service.WxSaltsService;
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
@RequestMapping("wxSaltsInfo")
@RestController
public class WxSaltsInfoController {
    @Autowired
    private WxSaltsService wxSaltsService;

    @RequestMapping("findAllByStuId")
    public JsonResult findAllByStuId(SaltsInfo saltsInfo) {
        return JsonResult.success(wxSaltsService.list(saltsInfo).getList());
    }

    @RequestMapping("addSalts")
    public JsonResult addSalts(SaltsInfo saltsInfo){
        return JsonResult.success(wxSaltsService.addSalts(saltsInfo));
    }

    @RequestMapping("cutSalts")
    public JsonResult cutSalts(SaltsInfo saltsInfo,String ids){
        return JsonResult.success(wxSaltsService.cutSalts(saltsInfo,ids));
    }

}
