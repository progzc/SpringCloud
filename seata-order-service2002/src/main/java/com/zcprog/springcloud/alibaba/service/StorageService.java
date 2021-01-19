package com.zcprog.springcloud.alibaba.service;

/**
 * @Description 服务接口
 * @Author zhaocho
 * @Date 2021/1/18 21:04
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    public void decrease(Long productId, Integer count);
}
