package top.wfaceboss.springcloud.alibaba.myHandler;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import top.wfaceboss.springcloud.entities.CommonResult;


public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockExceptionHandler exception) {
        System.out.println("----------处理异常---------");
        return new CommonResult(4444, "自定义限流处理信息....handlerException01");
    }


}
