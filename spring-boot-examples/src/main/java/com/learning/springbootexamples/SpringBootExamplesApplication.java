package com.learning.springbootexamples;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.learning.repository.ApplicationRepository;
import com.learning.entity.*;


@SpringBootApplication
public class SpringBootExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExamplesApplication.class, args);
		System.out.println("Hello World");
	}
	
//	@Bean
//	public CommandLineRunner demo(com.learning.repository.ApplicationRepository repository) {
//		return (args) -> {
//			repository.save(new com.learning.entity.Application("Trackzilla","kesha.williams","Application for tracking bugs."));
//			repository.save(new com.learning.entity.Application("Expenses","mary.jones","Application to track expense reports."));
//			repository.save(new com.learning.entity.Application("Notifications","karen.kane","Application to send alerts and notifications to users."));
//
//			for (Application application : repository.findAll()) {
//				System.out.println(("The application is: " + application.toString()));
//			}
//		};
//	}

}
