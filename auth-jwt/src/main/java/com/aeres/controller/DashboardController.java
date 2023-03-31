package com.aeres.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"dash"})
public class DashboardController {
	
	@GetMapping(value = "/landing-page")
	public String landingPage() {
		return "Welcome To Aeres";
	}
	
//	@RequestMapping({ "/hello" })
//	public String firstPage() {
//		return "Hello World";
//	}
	

}
