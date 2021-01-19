package com.zcprog.springcloud.alibaba.service;

import com.zcprog.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description
 * @Author zhaochao
 * @Date 2021/1/18 18:40
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService{
    @PostMapping(value = "/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
