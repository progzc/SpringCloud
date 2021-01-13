package com.zcprog.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description 配置类
 * @Author zhaochao
 * @Date 2021/1/13 15:57
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}

