package com.heroku.javatest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/some-service")
	public String getCount() {
		return new MyTestClass().toString();
	}
	
}