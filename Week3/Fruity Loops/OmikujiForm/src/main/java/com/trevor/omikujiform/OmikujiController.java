package com.trevor.omikujiform;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiController {
	@GetMapping("/")
	public String index() {
		return "redirect:/omikuji";
	}
	@GetMapping("/omikuji")
	public String form() {
		return "index.jsp";
	}
	/**
	 * @param session
	 * @param model
	 * @return
	 */
	@GetMapping("/omikuji/show")
	public String show(HttpSession session, Model model) {
		String showResult = (String) session.getAttribute("omikujiResult");
		model.addAttribute("showResult",showResult);
		return "show.jsp";
	}
	/**
	 * @param number
	 * @param city
	 * @param person
	 * @param hobby
	 * @param thing
	 * @param message
	 * @param session
	 * @return
	 */
	@PostMapping("/submitOmikuji")
	public String submit(
		@RequestParam("number") int number,
		@RequestParam("city") String city,
		@RequestParam("person") String person,
		@RequestParam("hobby") String hobby,
		@RequestParam("thing") String thing,
		@RequestParam("message") String message,
		HttpSession session) {
			
		String omikujiResult = String.format("In %s years, you will move to %s and have %s as your roomate,%s. "
				+ "The next time you see a %s, you will have good luck. Also, %s",
				number,city,person,hobby,thing,message);
		session.setAttribute("omikujiResult", omikujiResult);
		return "redirect:/omikuji/show";	
	}

}
