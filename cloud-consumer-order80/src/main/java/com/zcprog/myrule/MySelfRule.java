package com.zcprog.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 自定义负载均衡规则配置类
 * @Author zhaochao
 * @Date 2021/1/14 18:47
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        //定义为随机
        return new RandomRule();
    }
}
