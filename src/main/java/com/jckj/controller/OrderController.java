package com.jckj.controller;

import com.jckj.model.TOrderInfo;
import com.jckj.service.OrderService;
import com.jckj.util.SequenceUtil;
import com.jckj.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("page/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("list")
    public JsonResult list(TOrderInfo tOrderInfo){
        return JsonResult.success(orderService.list(tOrderInfo).getList(),orderService.count(tOrderInfo));
    }

    @PostMapping("add")
    public JsonResult add(TOrderInfo tOrderInfo){
        orderService.add(tOrderInfo);
        return JsonResult.success();
    }
}
