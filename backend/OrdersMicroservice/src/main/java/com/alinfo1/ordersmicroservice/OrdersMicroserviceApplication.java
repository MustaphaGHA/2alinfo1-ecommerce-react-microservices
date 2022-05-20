package com.alinfo1.ordersmicroservice;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class OrdersMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdersMicroserviceApplication.class, args);
	}
	@Bean
	ApplicationRunner init(OrderRepository repository) {
		return args ->{
			Stream.of(1,2,3).forEach(orderId -> {
				repository.save(new Order(orderId));
			});
			repository.findAll().forEach(System.out::println);
			
		};
	}
	
	

}