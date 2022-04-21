package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class InfytelEurekaZuulApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfytelEurekaZuulApigatewayApplication.class, args);
	}

}
