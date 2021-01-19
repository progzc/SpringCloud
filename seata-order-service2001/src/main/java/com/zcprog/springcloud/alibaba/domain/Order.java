package com.zcprog.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Description 订单实体类
 * @Author zhaochao
 * @Date 2021/1/18 18:20
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;
    private Long userId;
    private Long productId;
    private Integer count;
    private BigDecimal money;
    /**
     * 订单状态：0：创建中；1：已完结
     */
    private Integer status;
}

