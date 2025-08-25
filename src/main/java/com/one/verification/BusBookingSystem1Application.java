package com.one.verification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.one.verification.repository")
//@EntityScan(basePackages = "com.one.verification.model")
public class BusBookingSystem1Application {

	public static void main(String[] args) {
		SpringApplication.run(BusBookingSystem1Application.class, args);
	}

}
