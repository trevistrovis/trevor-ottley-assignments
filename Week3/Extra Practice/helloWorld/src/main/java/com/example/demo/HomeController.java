package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("dojoName", "Burbank");
		return "demo.jsp";
		
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
