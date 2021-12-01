package com.bitan.bitan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ControllerCheckApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControllerCheckApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/get").allowedOrigins("*");
				registry.addMapping("/inc").allowedOrigins("*");
				registry.addMapping("/dec").allowedOrigins("*");
			}
		};
	}

}
