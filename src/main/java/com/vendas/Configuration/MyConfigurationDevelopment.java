package com.vendas.Configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("development")
public class MyConfigurationDevelopment {
	
	@Bean
	public CommandLineRunner execute() {
		return args ->{
			System.out.println("\n EXECUTING IN DEVELOPMENT ENVIROMENT \n");
		};
	}

}