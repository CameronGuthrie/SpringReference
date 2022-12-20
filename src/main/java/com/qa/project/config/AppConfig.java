package com.qa.project.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean // inversion of control, adds this to application context
	public ModelMapper getMapper() {
		return new ModelMapper();
	}

}
