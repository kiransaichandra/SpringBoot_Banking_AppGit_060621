package com.project.springboot.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@Scope(value="prototype")
//@ComponentScan(basePackages= {"com.project.springboot.bank.controllers"})
public class SpringBootBankingApp060621Application {

	public static void main(String[] args) {	
		SpringApplication.run(SpringBootBankingApp060621Application.class, args);
		
//		ConfigurableApplicationContext context = SpringApplication.run(SpringBootBankingApp060621Application.class, args);
//		Alien obj = context.getBean(Alien.class);
//		obj.show();
	}

}
