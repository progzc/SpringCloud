package com.zcprog.springcloud.alibaba.service;

import com.zcprog.springcloud.entities.CommonResult;
import com.zcprog.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Description 服务实现类
 * @Author zhaochao
 * @Date 2021/1/18 13:36
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
