package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerProjectApplication.class, args);
	}
	 @GetMapping("/dockerApp")

	 public String testDockerApp()

	 {

	 return "Docker application test Successful";

	 }
}
