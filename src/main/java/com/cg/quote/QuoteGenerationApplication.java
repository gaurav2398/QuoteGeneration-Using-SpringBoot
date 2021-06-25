package com.cg.quote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cg.quote.dao.UserRoleRepository;

@SpringBootApplication
public class QuoteGenerationApplication {	
	
	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(QuoteGenerationApplication.class, args);
		UserRoleRepository employeeRepository = context.getBean(UserRoleRepository.class);
	}
}
