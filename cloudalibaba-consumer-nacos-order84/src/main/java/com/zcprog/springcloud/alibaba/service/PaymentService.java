package com.zcprog.springcloud.alibaba.service;

import com.zcprog.springcloud.entities.CommonResult;
import com.zcprog.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description 服务接口
 * @Author zhaochao
 * @Date 2021/1/18 13:34
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService
{
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}

