package com.example.demoeureka7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Demoeureka7001Application {

    public static void main(String[] args) {
        SpringApplication.run(Demoeureka7001Application.class, args);
    }

}
