package com.app.controller;

import com.app.service.WxSaltsService;
import com.jckj.model.Mien;
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
    public JsonResult findAllByStuId(SaltsInfo saltsInfo,String date) {
        return JsonResult.success(wxSaltsService.list(saltsInfo,date).getList());
    }

    @RequestMapping("addSalts")
    public JsonResult addSalts(SaltsInfo saltsInfo){
        return JsonResult.success(wxSaltsService.addSalts(saltsInfo));
    }

    @RequestMapping("cutSalts")
    public JsonResult cutSalts(SaltsInfo saltsInfo,String ids){
        return JsonResult.success(wxSaltsService.cutSalts(saltsInfo,ids));
    }

    @RequestMapping("addMien")
    public JsonResult addMien(Mien mien){
        return JsonResult.success(wxSaltsService.addMien(mien));
    }

}
