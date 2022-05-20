package com.alinfo1.productmicroservice;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}
	@Bean
	ApplicationRunner init(ProductRepository repository) {
		return args ->{
			Stream.of(1,2,3).forEach(ProductId -> {
				repository.save(new Product(ProductId));
			});
			repository.findAll().forEach(System.out::println);
			
		};
	}
	
	

}
