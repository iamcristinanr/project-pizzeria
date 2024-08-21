package com.project.pizzeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ProjectPizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectPizzeriaApplication.class, args);
	}

}
