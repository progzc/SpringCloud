package com.zcprog.springcloud.alibaba.controller;

import com.zcprog.springcloud.alibaba.domain.CommonResult;
import com.zcprog.springcloud.alibaba.domain.Order;
import com.zcprog.springcloud.alibaba.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 控制器
 * @Author zhaochao
 * @Date 2021/1/18 18:54
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}


