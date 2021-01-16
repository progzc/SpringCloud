package com.zcprog.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description 主启动类
 * @Author zhaochao
 * @Date 2021/1/16 21:20
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMQMain8802 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQMain8802.class, args);
    }
}

