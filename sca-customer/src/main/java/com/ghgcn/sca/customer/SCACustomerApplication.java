package com.ghgcn.sca.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@EntityScan("com.ghgcn.sca.domain")
public class SCACustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SCACustomerApplication.class,args);
    }
}
