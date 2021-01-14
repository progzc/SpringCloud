package com.zcprog.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description OpenFeign日志配置
 * @Author zhaochao
 * @Date 2021/1/14 23:51
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
