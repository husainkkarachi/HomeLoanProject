package com.lti.homeloan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class HomeLoaProjectApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Spring BOOT");
		SpringApplication.run(HomeLoaProjectApplication.class, args);
	}
	@SuppressWarnings("deprecation")
    @Bean
    public WebMvcConfigurerAdapter corsConfigurer() {
          return new WebMvcConfigurerAdapter() {
             @Override
             public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/rest").allowedOrigins("http://localhost:4200");
             }
          };
       }

}
