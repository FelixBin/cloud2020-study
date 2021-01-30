package top.wfaceboss.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulPaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(ConsulPaymentMain8001.class,args);
    }
}
