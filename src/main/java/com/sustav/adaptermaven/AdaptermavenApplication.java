package com.sustav.adaptermaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AdaptermavenApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AdaptermavenApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(AdaptermavenApplication.class);
	}

}

