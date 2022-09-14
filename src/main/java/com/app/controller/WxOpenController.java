package com.app.controller;

import com.app.service.WxOpenService;
import com.jckj.vo.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author 小江
 * @date 2022/9/13 16:57
 * @describe:
 */
@RequestMapping("wx/open")
@RestController
public class WxOpenController {

    @Resource
    private WxOpenService wxOpenService;

    @RequestMapping("findAllPhotoInfo")
    public JsonResult findAllPhotoInfo() {
        return JsonResult.success(wxOpenService.findAllPhotoInfo().getList());
    }

    @RequestMapping("findAllOpenIntegral")
    public JsonResult findAllOpenIntegral() {
        return JsonResult.success(wxOpenService.findAllOpenIntegral().getList());
    }

    @RequestMapping("findAllOpenRotation")
    public JsonResult findAllOpenRotation() {
        return JsonResult.success(wxOpenService.findAllOpenRotation().getList());
    }
    @RequestMapping("replaceSchool")
    public void replaceSchool(HttpSession session,String schoolName){
        wxOpenService.replaceSchool(session,schoolName);
    }

}
