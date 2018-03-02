package com.sooncode.creative_build_registration_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegistrationCenter4CreativeBuild  {

    public static void main(String[] args) {
        SpringApplication.run(RegistrationCenter4CreativeBuild.class, args);
    }
}
