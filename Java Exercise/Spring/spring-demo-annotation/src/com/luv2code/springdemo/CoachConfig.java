package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class CoachConfig {

	@Bean
	public FortuneService walkingFortuneService() {
		return new WalkingFortuneService();
	}
	
	
	
	@Bean
	public Coach walkingCoach() {
		return new WalkingCoach(walkingFortuneService());
	}
	
}
