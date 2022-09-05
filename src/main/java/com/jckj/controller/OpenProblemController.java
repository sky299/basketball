package com.jckj.controller;

import com.jckj.model.OpenProblem;
import com.jckj.service.OpenProblemService;
import com.jckj.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 柳江
 * @date 2022/9/2 1:23
 * @describe:
 */
@RequestMapping("openProblem")
@RestController
public class OpenProblemController {
    @Autowired
    private OpenProblemService openProblemService;

    @RequestMapping("findAll")
    public JsonResult list(OpenProblem openProblem) {
        return JsonResult.success(openProblemService.list(openProblem).getList(),openProblemService.count());
    }

    @RequestMapping("findById")
    public JsonResult courseInfo(OpenProblem openProblem){
        return JsonResult.success(openProblemService.findById(openProblem));
    }

    @RequestMapping("delete")
    public JsonResult delete(String id){
        return JsonResult.success(openProblemService.delete(id));
    }

    @RequestMapping("update")
    public JsonResult update(OpenProblem openProblem) {
        return JsonResult.success(openProblemService.update(openProblem));
    }

    @RequestMapping("add")
    public JsonResult add(OpenProblem openProblem) {
        return JsonResult.success(openProblemService.add(openProblem));
    }
}
