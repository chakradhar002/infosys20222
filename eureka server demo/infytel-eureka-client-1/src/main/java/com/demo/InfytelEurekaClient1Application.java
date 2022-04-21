package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InfytelEurekaClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(InfytelEurekaClient1Application.class, args);
	}

}
