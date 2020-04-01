package com.sample.kubernetes.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan("com.sample.*")
@EntityScan("com.sample.kubernetes.repo")
@EnableMongoRepositories("com.sample.kubernetes.repo")
public class SpringbootController {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootController.class, args);

	}

}
