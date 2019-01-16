package com.example.FirstSpringWebApplication1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

//import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication/*(exclude = ErrorMvcAutoConfiguration.class )*/
//@EnableAutoConfiguration

@ComponentScan(basePackages= {"com.example.FirstSpringWebApplication1"})
public class FirstSpringWebApplication1Application extends SpringBootServletInitializer {

	
	@Override
	  protected SpringApplicationBuilder configure (SpringApplicationBuilder builder) {
	      return builder.sources(FirstSpringWebApplication1Application.class);
	  }
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringWebApplication1Application.class, args);
	}

	
}

