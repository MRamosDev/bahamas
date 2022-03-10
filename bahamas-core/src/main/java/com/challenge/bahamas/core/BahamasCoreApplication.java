package com.challenge.bahamas.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BahamasCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BahamasCoreApplication.class, args);
	}

}
