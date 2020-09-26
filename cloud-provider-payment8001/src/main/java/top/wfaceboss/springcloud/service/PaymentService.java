package top.wfaceboss.springcloud.service;

import top.wfaceboss.springcloud.entities.Payment;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long  id);
}
