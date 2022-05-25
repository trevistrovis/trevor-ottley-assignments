package com.codingdojo.trevor.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.trevor.models.Book;
import com.codingdojo.trevor.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bService;
	
	@GetMapping("/new")
	public String newBook(HttpSession session, @ModelAttribute("newBook") Book book) {
		if(session.getAttribute("loggedInUser") != null) {
			return "new.jsp";
		}
		else {
			return "redirect:/";
		}
	}
	
	@PostMapping("/create")
	public String createOneBook(@Valid @ModelAttribute("newBook") Book book, BindingResult result) {
		if(result.hasErrors()) {
			return "new.jsp";
		}
		else {
			bService.createBook(book);
			return "redirect:/dashboard";
		}
	}
	
	@GetMapping("/view/{id}")
	public String viewOneBook(@PathVariable Long id, Model model, HttpSession session) {
		if (session.getAttribute("loggedInUser") != null) {
			Book book = bService.getOneBook(id);
			model.addAttribute("book", book);
			return "viewBook.jsp";
			
		}
		else {
			return "redirect:/";
		}
	}
		
	

}
