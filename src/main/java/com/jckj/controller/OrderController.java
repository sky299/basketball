package com.jckj.controller;

import com.jckj.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("page/order")
public class OrderController {

    @Autowired
    private OrderService orderService;


}
