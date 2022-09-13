package com.thymeleaf.TallerThymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class TallerThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(TallerThymeleafApplication.class, args);
	}

}
