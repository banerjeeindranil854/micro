package com.indranil.stockService.microStockService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MicroStockServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroStockServiceApplication.class, args);
	}
}
