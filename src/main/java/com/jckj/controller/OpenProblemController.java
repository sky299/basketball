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

    /**
     * 问题列表全部
     * @param openProblem 问题对象
     * @return JaonResult
     */
    @RequestMapping("findAll")
    public JsonResult list(OpenProblem openProblem) {
        return JsonResult.success(openProblemService.list(openProblem).getList(),openProblemService.count());
    }

    /**
     * 问题详情查询
     * @param openProblem 问题对象
     * @return JaonResult
     */
    @RequestMapping("findById")
    public JsonResult courseInfo(OpenProblem openProblem){
        return JsonResult.success(openProblemService.findById(openProblem));
    }

    /**
     * 问题批量删除和删除
     * @param id 问题id
     * @return JaonResult
     */
    @RequestMapping("delete")
    public JsonResult delete(String id){
        return JsonResult.success(openProblemService.delete(id));
    }

    /**
     * 问题修改
     * @param openProblem 问题对象
     * @return JaonResult
     */
    @RequestMapping("update")
    public JsonResult update(OpenProblem openProblem) {
        return JsonResult.success(openProblemService.update(openProblem));
    }

    /**
     * 问题添加功能
     * @param openProblem 问题对象
     * @return JaonResult
     */
    @RequestMapping("add")
    public JsonResult add(OpenProblem openProblem) {
        return JsonResult.success(openProblemService.add(openProblem));
    }
}
