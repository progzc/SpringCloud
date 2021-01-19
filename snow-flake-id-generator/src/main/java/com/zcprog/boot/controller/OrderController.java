package com.zcprog.boot.controller;

import com.zcprog.boot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 控制器
 * @Author zhaochao
 * @Date 2021/1/19 9:48
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(("/snowflake"))
    public String index(){
        return orderService.getIdBySnowFlake();
    }
}
