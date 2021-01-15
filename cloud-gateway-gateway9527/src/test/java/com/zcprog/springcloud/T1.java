package com.zcprog.springcloud;

import java.time.ZonedDateTime;

/**
 * @Description 测试类
 * @Author zhaochao
 * @Date 2021/1/15 22:11
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
public class T1 {
    public static void main(String[] args) {
        ZonedDateTime dateTime = ZonedDateTime.now();
        System.out.println(dateTime); // 2021-01-15T22:15:25.348+08:00[Asia/Shanghai]
    }
}
