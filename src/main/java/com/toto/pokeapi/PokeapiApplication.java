package com.toto.pokeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
@EnableAsync
public class PokeapiApplication {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(PokeapiApplication.class, args);
	}

}
