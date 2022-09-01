package com.jckj.controller;

import com.jckj.model.OpenIntegral;
import com.jckj.service.OpenIntegralService;
import com.jckj.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 柳江
 * @date 2022/9/2 0:08
 * @describe: 积分获取方式管理
 */
@RequestMapping("openIntegral")
@RestController
public class OpenIntegralController {
    @Autowired
    private OpenIntegralService openIntegralService;

    @RequestMapping("findAll")
    public JsonResult list(OpenIntegral openIntegral) {
        return JsonResult.success(openIntegralService.list(openIntegral).getList(),openIntegralService.count());
    }

    @RequestMapping("findById")
    public JsonResult courseInfo(OpenIntegral openIntegral){
        return JsonResult.success(openIntegralService.findById(openIntegral));
    }

    @RequestMapping("delete")
    public JsonResult delete(String id){
        return JsonResult.success(openIntegralService.delete(id));
    }

    @RequestMapping("update")
    public JsonResult update(OpenIntegral openIntegral) {
        return JsonResult.success(openIntegralService.update(openIntegral));
    }

    @RequestMapping("add")
    public JsonResult add(OpenIntegral openIntegral) {
        return JsonResult.success(openIntegralService.add(openIntegral));
    }
}
