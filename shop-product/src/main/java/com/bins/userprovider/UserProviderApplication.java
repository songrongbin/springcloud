package com.bins.userprovider;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserProviderApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(UserProviderApplication.class).run(args);
    }
}
