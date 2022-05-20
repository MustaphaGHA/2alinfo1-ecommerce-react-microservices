package com.alinfo1.shipping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MehdiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MehdiApplication.class, args);
    }

}
