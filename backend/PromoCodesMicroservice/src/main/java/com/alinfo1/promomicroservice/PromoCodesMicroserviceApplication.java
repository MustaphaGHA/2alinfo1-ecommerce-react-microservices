package com.alinfo1.promomicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PromoCodesMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PromoCodesMicroserviceApplication.class, args);
	}

}
