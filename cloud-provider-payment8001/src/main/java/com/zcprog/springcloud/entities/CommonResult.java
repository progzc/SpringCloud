package com.zcprog.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 返回结果封装
 * @Author zhaochao
 * @Date 2021/1/13 11:06
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T>{
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
