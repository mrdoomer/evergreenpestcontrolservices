package com.evergreenpestcontrolservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {

	@GetMapping("/")
	public String hello() {
		return "Hello Your Web Application Is working fine";
	}
	

	@GetMapping("/jsp")
	public ModelAndView jsptest() {
		return new ModelAndView("test");
	}
	
	
}
