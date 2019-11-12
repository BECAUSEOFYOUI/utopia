package com.magic.utopia.entity.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UtopiaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UtopiaServerApplication.class,args);
    }
}
