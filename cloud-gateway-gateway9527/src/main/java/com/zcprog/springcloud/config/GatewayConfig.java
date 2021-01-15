package com.zcprog.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 网关路由配置类
 * @Author zhaochao
 * @Date 2021/1/15 21:31
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@Configuration
public class GatewayConfig {
    /**
     * 配置了一个id为path_route的路由规则，当访问地址http://localhost:9527/guonei时会自动转发到http://news.baidu.com/guonei
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route", r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }
}
