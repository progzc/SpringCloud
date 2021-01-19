package com.zcprog.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Description TODO
 * @Author zhaocho
 * @Date 2021/1/18 21:28
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
public interface AccountService {

    /**
     * 扣减账户余额
     */
    public void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
