package com.zcprog.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description 支付模块8004
 * @Author zhaochao
 * @Date 2021/1/14 11:48
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@SpringBootApplication
// @EnableDiscoveryClient用于向Consul或者Zookeeper作为注册中心时注册服务
@EnableDiscoveryClient
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
