package com.ghgcn.sca.provider;

import io.seata.config.Configuration;
import io.seata.config.ConfigurationFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//com.ghgcn.sca.entity
@EnableDiscoveryClient
@SpringBootApplication
@EntityScan("com.ghgcn.sca.domain")
public class SCAProviderApplicatin {
    public static void main(String[] args) {

        SpringApplication.run(SCAProviderApplicatin.class, args);

        Configuration config = ConfigurationFactory.getInstance();
        String configStr = config.getConfig("service.vgroupMapping.sca-provicer");
        System.out.println("SCAProviderApplicatin: "+configStr);

    }
}
