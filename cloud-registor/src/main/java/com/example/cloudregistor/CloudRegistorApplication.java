package com.example.cloudregistor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudRegistorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudRegistorApplication.class, args);
	}
}
