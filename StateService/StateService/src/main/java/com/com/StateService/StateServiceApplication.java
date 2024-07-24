package com.com.StateService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class StateServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(StateServiceApplication.class, args);

	}
	@Bean
	public WebClient webClient(){
		return WebClient.builder().build();
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
