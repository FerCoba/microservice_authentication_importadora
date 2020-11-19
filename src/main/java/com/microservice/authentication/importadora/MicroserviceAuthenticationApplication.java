package com.microservice.authentication.importadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviceAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceAuthenticationApplication.class, args);
	}

}
