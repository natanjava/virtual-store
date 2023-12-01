package com.futshop.futshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class FutshopApplication {

	public static void main(String[] args){
		SpringApplication.run(FutshopApplication.class, args);
		/*
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String result = encoder.encode("admin123");
		System.out.println(result);
		 * */
		
	}
	
	/*
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(FutshopApplication.class);
	}
	 * */
}
