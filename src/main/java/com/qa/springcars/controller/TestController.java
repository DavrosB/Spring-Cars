package com.qa.springcars.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Allows for external access to our application via HTTP requests
public class TestController {
	
	

//	Allows our programme to accept REQUESTS and generate RESPONSES

	
	
	
	@GetMapping("/test") // @TypeofRequest("location")
	public String thisMethod() {
		return "Hi";
	}

	
	
	
	
}
