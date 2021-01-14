package com.zcprog.springcloud.controller;

import com.zcprog.springcloud.entities.CommonResult;
import com.zcprog.springcloud.entities.Payment;
import com.zcprog.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 控制器
 * @Author zhaochao
 * @Date 2021/1/14 22:16
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }
}
