package com.micro.example1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceBeginingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBeginingApplication.class, args);
	}

}
