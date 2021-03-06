package com.example.cloudserviceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudServiceProviderApplication.class, args);
	}
}
