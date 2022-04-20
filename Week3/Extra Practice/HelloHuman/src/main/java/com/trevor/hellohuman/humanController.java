package com.trevor.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class humanController {
	
	@RequestMapping("")
	public String hello(@RequestParam(value = "firstName", required = false)String firstName) {
		if(firstName == null) {
			return "Hello unidentified human!";
		}
		else {
			return "Hello, " + firstName + "!";
		}
		
	}

}
