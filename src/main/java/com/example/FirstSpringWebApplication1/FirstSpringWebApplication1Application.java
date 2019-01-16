package com.example.FirstSpringWebApplication1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

//import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
//@EnableAutoConfiguration
@ComponentScan(basePackages= {"com.example.FirstSpringWebApplication1"})
public class FirstSpringWebApplication1Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringWebApplication1Application.class, args);
	}

	
}

