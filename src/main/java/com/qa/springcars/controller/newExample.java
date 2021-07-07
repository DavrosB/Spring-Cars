package com.qa.springcars.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

public class newExample {

	@SpringBootApplication
	public class SpringExampleApplication {

		public void main(String[] args) {
			ApplicationContext context = SpringApplication.run(SpringExampleApplication.class, args);

			Object byName = context.getBean("greeting");
			Object byType = context.getBean(String.class);
			Object byBoth = context.getBean("greeting", String.class);

			System.out.println(byName);
			System.out.println(byType);
			System.out.println(byBoth);

		}

	}

}
