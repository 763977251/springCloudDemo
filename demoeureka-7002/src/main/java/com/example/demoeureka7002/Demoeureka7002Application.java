package com.example.demoeureka7002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Demoeureka7002Application {

    public static void main(String[] args) {
        SpringApplication.run(Demoeureka7002Application.class, args);
    }

}
