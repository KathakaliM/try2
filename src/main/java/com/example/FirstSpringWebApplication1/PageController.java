package com.example.FirstSpringWebApplication1;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@EnableAutoConfiguration
//@ComponentScan(basePackages = {"com.example.FirstSpringWebApplication1"})
public class PageController  {
  
	@RequestMapping("/web")
	public String home()
	{
		return "web";
	}
}
