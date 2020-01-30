package com.repositoryrest.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.repositoryrest.*")
@EntityScan("com.repositoryrest.*")
@EnableJpaRepositories("com.repositoryrest.*")
public class repositoryRestMain {

	public static void main(String[] args) {
		SpringApplication.run(repositoryRestMain.class, args);
	}

}
