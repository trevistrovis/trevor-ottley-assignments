package com.trevor.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	
	@RequestMapping("")
	public String welcome() {
		return "Welcome!";
	}

	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an oppurtunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("travel/{city}")
	public String city(@PathVariable("city") String city) {
		return "Congratulations! You will soon travel to " + city;
	}
	
	@RequestMapping("lotto/{luckyNum}")
		public String lotto(@PathVariable("luckyNum") int luckyNum) {
			if(luckyNum %2 == 0) {
				return "You will take a grand journey in the near future, but be wary of tempting offers.";
			}
			else {
				return "You have enjoyed the fruits of your labor, but now is a good time to spend time with friends and family";
			}
	}
}	


