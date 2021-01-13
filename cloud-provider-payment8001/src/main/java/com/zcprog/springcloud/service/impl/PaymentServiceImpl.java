package com.zcprog.springcloud.service.impl;

import com.zcprog.springcloud.dao.PaymentDao;
import com.zcprog.springcloud.entities.Payment;
import com.zcprog.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description PaymentService接口实现类
 * @Author zhaochao
 * @Date 2021/1/13 15:02
 * @Email zcprog@foxmail.com
 * @Version V1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
