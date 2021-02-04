package top.wfaceboss.springcloud.alibaba.service.Impl;

import org.springframework.stereotype.Component;
import top.wfaceboss.springcloud.alibaba.service.PaymentService;
import top.wfaceboss.springcloud.entities.CommonResult;
import top.wfaceboss.springcloud.entities.Payment;

@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}