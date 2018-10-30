package com.udea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
public class UdearrobaProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdearrobaProductsApplication.class, args);
	}
}
