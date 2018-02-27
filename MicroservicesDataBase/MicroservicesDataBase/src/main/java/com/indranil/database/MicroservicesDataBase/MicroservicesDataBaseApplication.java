package com.indranil.database.MicroservicesDataBase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@EnableJpaRepositories(basePackages = "com.indranil.database.MicroservicesDataBase.repository")
@SpringBootApplication
public class MicroservicesDataBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesDataBaseApplication.class, args);
	}
}
