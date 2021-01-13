package com.zcprog.springcloud.dao;

import com.zcprog.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description 支付模块数据操作接口
 * @Author zhaochao
 * @Date 2021/1/13 11:13
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id")Long id);
}
