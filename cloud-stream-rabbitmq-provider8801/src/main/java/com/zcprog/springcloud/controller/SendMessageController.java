package com.zcprog.springcloud.controller;

import com.zcprog.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 控制器
 * @Author zhaochao
 * @Date 2021/1/16 20:17
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@RestController
public class SendMessageController {
    @Autowired
    private IMessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return messageProvider.send();
    }
}
