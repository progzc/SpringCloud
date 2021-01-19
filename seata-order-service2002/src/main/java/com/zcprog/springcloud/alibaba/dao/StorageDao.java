package com.zcprog.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description Dao接口
 * @Author zhaochao
 * @Date 2021/1/18 20:58
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@Mapper
public interface StorageDao {
    /**
     * 扣减库存信息
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}

