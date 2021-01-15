package com.zcprog.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author zhaochao
 * @Date 2021/1/15 13:48
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@Component
public class PaymentFallbackServer implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackServer fall back-paymentInfo_OK, /(ㄒoㄒ)/~~";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackServer fall back-paymentInfo_TimeOut, /(ㄒoㄒ)/~~";
    }
}
