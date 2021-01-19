package com.zcprog.springcloud.alibaba.service;

import com.zcprog.springcloud.alibaba.domain.Order;

/**
 * @Description  订单服务接口
 * @Author zhaocho
 * @Date 2021/1/18 18:37
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
public interface OrderService{
    void create(Order order);
}
