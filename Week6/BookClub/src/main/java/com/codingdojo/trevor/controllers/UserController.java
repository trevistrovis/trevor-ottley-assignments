package com.codingdojo.trevor.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.trevor.models.LoginUser;
import com.codingdojo.trevor.models.User;
import com.codingdojo.trevor.services.BookService;
import com.codingdojo.trevor.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private BookService bService;
	
	@GetMapping("/")
	public String index( 
			@ModelAttribute("newUser") User user, 
			@ModelAttribute("newLogin") LoginUser loginUser) {
		return "index.jsp";
	}
	
	
	//*********Register a User************
	@PostMapping("/registration")
	public String registerUser(@Valid @ModelAttribute("newUser") User user,
			BindingResult result, HttpSession session, @ModelAttribute("newLogin") LoginUser loginUser) {
		//validate user
		userService.validate(user, result);
		if(result.hasErrors()) {
			return "index.jsp";
		}
		//register user
		userService.registerUser(user);
		
		//put user in session
		session.setAttribute("loggedInUser", user);
		return "redirect:/dashboard";
	}
	
	//*********Login***************
	@PostMapping("/login")
	public String loginUser(@Valid @ModelAttribute("newLogin") LoginUser loginUser, 
			BindingResult results, 
			HttpSession session, 
			@ModelAttribute("newUser") User user) {
		
		// authenticate user
		userService.authenticateUser(loginUser, results);
		if (results.hasErrors()) {
			return "index.jsp";
		}
		User loggedInUser=userService.findByEmail(loginUser.getEmail());
		
		
		// put user in session 
		session.setAttribute("loggedInUser", loggedInUser);
		
		return "redirect:/dashboard";
	}
	
	//********Logout**********
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	@GetMapping("/dashboard")
	public String dashboard(HttpSession session, Model model) {
		//check if user is in session; 
		if(session.getAttribute("loggedInUser")!=null){
			model.addAttribute("books", bService.allBooks());
			return "dashboard.jsp";
		}
		else {
			return "redirect:/";
		}
	}

}

