package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Andre Wang
 * @version 1.0
 */
//@EnableEurekaServer 表示该程序,作为 Eureka Server
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication9001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication9001.class, args);
    }
}
