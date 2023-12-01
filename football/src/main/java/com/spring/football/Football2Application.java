package com.spring.football;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class Football2Application {

	public static void main(String[] args) {
		SpringApplication.run(Football2Application.class, args);
	}

}
