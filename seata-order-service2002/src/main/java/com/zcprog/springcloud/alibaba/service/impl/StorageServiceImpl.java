package com.zcprog.springcloud.alibaba.service.impl;

import com.zcprog.springcloud.alibaba.dao.StorageDao;
import com.zcprog.springcloud.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description 服务实现类
 * @Author zhaochao
 * @Date 2021/1/18 21:04
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {
    @Resource
    private StorageDao storageDao;

    /**
     * 扣减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
        log.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId, count);
        log.info("------->storage-service中扣减库存结束");
    }
}

