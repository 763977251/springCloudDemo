package com.example.democonsumerhystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class DemoConsumerHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoConsumerHystrixDashboardApplication.class, args);
    }

}
