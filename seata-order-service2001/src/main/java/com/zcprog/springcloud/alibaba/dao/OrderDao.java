package com.zcprog.springcloud.alibaba.dao;

import com.zcprog.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description 订单Dao接口
 * @Author zhaocho
 * @Date 2021/1/18 18:23
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@Mapper
public interface OrderDao {
    /**
     * 新建订单
     */
    void create(Order order);

    /**
     * 修改订单状态，从0改为1
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
