package com.zcprog.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Description 账户实体类
 * @Author zhaochao
 * @Date 2021/1/18 21:24
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 总额度
     */
    private BigDecimal total;
    /**
     * 已用额度
     */
    private BigDecimal used;
    /**
     * 剩余额度
     */
    private BigDecimal residue;
}

