package top.wfaceboss.springcloud.service.impl;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import top.wfaceboss.springcloud.dao.PaymentDao;
import top.wfaceboss.springcloud.entities.Payment;
import top.wfaceboss.springcloud.service.PaymentService;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long  id) {
        return paymentDao.getPaymentById(id);
    }
}
