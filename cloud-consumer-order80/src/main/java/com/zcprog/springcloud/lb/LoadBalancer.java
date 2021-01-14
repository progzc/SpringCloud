package com.zcprog.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Description 自定义负载均衡算法接口
 * @Author zhaocho
 * @Date 2021/1/14 19:20
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
