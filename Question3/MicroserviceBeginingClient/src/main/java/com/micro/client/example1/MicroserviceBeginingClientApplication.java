package com.micro.client.example1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroserviceBeginingClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBeginingClientApplication.class, args);
	}
	@GetMapping
	public String hello()
	{
		return "printing from client ";
	}

}
