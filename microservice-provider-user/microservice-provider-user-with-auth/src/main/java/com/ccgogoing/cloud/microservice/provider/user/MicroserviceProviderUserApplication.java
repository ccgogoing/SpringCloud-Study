package com.ccgogoing.cloud.microservice.provider.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviceProviderUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProviderUserApplication.class, args);
	}
}
