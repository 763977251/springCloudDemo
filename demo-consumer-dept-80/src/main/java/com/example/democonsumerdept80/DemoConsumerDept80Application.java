package com.example.democonsumerdept80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoConsumerDept80Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoConsumerDept80Application.class, args);
    }

}
