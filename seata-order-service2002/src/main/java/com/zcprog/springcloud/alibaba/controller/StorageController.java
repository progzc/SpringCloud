package com.zcprog.springcloud.alibaba.controller;

import com.zcprog.springcloud.alibaba.domain.CommonResult;
import com.zcprog.springcloud.alibaba.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 控制器
 * @Author zhaochao
 * @Date 2021/1/18 21:07
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@RestController
public class StorageController {
    @Autowired
    private StorageService storageService;
    /**
     * 扣减库存
     * @param productId
     * @param count
     * @return
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }
}
