package com.zcprog.boot.service;

import com.zcprog.boot.util.IdGeneratorSnowflake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description 服务类
 * @Author zhaochao
 * @Date 2021/1/19 9:48
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@Service
public class OrderService {
    @Autowired
    private IdGeneratorSnowflake idGenerator;

    public String getIdBySnowFlake() {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 20; i++) {
            threadPool.submit(()->{
                System.out.println(idGenerator.snowflakeId());
            });
        }
        threadPool.shutdown();
        return "hello snowflake";
    }
}
