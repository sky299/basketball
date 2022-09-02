package com.jckj.controller;

import com.jckj.model.OpenAnswer;
import com.jckj.service.OpenAnswerService;
import com.jckj.vo.JsonResult;
import com.jckj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 柳江
 * @date 2022/9/2 10:09
 * @describe:
 */
@RequestMapping("openanswer")
@RestController
public class OpenAnswerController {
    @Autowired
    private OpenAnswerService openAnswerService;

    @RequestMapping("find")
    public JsonResult list(OpenAnswer openAnswer){
        return JsonResult.success(openAnswerService.find(openAnswer).getList());
    }
    @RequestMapping("delete")
    public JsonResult delete(OpenAnswer openAnswer){
        return JsonResult.success(openAnswerService.delete(openAnswer));
    }

    @RequestMapping("update")
    public JsonResult update(OpenAnswer openAnswer) {
        return JsonResult.success(openAnswerService.update(openAnswer));
    }

    @RequestMapping("add")
    public JsonResult add(OpenAnswer openAnswer) {
        return JsonResult.success(openAnswerService.add(openAnswer));
    }
}
