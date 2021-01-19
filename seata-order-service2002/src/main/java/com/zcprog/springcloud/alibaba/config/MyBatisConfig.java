package com.zcprog.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description MyBatis配置类
 * @Author zhaochao
 * @Date 2021/1/18 21:10
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@Configuration
@MapperScan({"com.zcprog.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
