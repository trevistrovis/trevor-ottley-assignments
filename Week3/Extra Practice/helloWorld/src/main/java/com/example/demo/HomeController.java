package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String index(@RequestParam(value = "q", required=false)String searchQuery) {
		if(searchQuery == null) {
			return "You searched for nothing";
		}
		else {
			return "You searched for: " + searchQuery;
		}
	}
	@RequestMapping("/greeting")
	public String greeting() {
		return "Hi, Trevor!";
	}
	
	@RequestMapping("/m/{track}/{module}/{lesson}")
	public String newLesson(@PathVariable("track")String track, @PathVariable("module")String module, @PathVariable("lesson")String lesson) {
		return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
	}

}
