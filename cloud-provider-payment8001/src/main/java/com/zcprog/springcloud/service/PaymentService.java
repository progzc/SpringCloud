package com.zcprog.springcloud.service;

import com.zcprog.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Description
 * @Author zhaochao
 * @Date 2021/1/13 15:04
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
public interface PaymentService {
    public int create(Payment payment); //写
    public Payment getPaymentById(@Param("id") Long id);  //读取
}
