package com.zcprog.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Description TODO
 * @Author zhaocho
 * @Date 2021/1/18 21:26
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@Mapper
public interface AccountDao {
    /**
     * 扣减账户余额
     */
    public void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
