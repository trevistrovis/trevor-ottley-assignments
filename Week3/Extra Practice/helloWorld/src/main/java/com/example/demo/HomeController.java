package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hello")
public class HomeController {
	
	@RequestMapping("")
	public String hello() {
		return "Hello World!!";
	}
	@RequestMapping("/greeting")
	public String greeting() {
		return "Hi, Trevor!";
	}

}
