package com.org.springBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication implements CommandLineRunner {


	@Autowired
	private ApplicationContext context;

	public static void main(String[] args) {

		SpringApplication.run(SpringBootDemoApplication.class, args);

		LogDemo.temp();


	}

	@Override
	public void run(String... args) throws Exception {
		// Get a bean by its name
		 Config config = context.getBean(Config.class);
		System.out.println(config.configTestClass.name);
	}

}
