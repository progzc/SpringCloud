package com.zcprog.springcloud.alibaba.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zcprog.springcloud.entities.CommonResult;

/**
 * @Description 自定义全局兜底
 * @Author zhaochao
 * @Date 2021/1/18 10:58
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
public class CustomerBlockHandler {
    // 必须是静态方法
    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(4444, "按客户自定义，global handlerException----1");
    }

    // 必须是静态方法
    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(4444, "按客户自定义，global handlerException----2");
    }
}
