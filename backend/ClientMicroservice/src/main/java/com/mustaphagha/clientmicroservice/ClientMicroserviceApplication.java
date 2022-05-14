package com.mustaphagha.clientmicroservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.query.Query;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


@SpringBootApplication
@EnableDiscoveryClient
public class ClientMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientMicroserviceApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ClientRepository repository) {
		return args -> {
			Address address = new Address(
					"",
					"",
					"",
					"");
			ClientEntity client = new ClientEntity(
					"Mustapha",
					"Ghannouchi",
                    address,
                    "mustaphaghannouchi@gmail.com",
					Gender.MALE,
					Arrays.asList("Product") ,
					BigDecimal.TEN,
					LocalDateTime.now()
			);

			//repository.findClientEntityByEmail(client.getEmail()).orElse(repository.insert(client));
		};
	}

}
