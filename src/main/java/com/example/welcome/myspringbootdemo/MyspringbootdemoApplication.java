package com.example.welcome.myspringbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyspringbootdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MyspringbootdemoApplication.class, args);
		for(String name: context.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}
}
