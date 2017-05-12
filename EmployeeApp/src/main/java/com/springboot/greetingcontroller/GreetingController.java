package com.springboot.greetingcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@RequestMapping("/")
	public String getGreeting(){
		return "Good Morning ! Welcome to the Spring Boot";
	}

}
