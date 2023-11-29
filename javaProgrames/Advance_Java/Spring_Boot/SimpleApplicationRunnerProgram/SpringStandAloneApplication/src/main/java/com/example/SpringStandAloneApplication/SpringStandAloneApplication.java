package com.example.SpringStandAloneApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringStandAloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStandAloneApplication.class, args);
		System.out.println("Hii");
	}

	@Bean
	public CommandLineRunner commandLineRunner(String[] args) {
		return runner -> {
			System.out.println("runner");
		};
	}

}
