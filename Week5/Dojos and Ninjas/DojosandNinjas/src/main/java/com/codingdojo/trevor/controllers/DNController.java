package com.codingdojo.trevor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.trevor.models.Dojo;
import com.codingdojo.trevor.models.Ninja;
import com.codingdojo.trevor.services.DojoNinjaService;


@Controller
public class DNController {
	
	@Autowired
	private DojoNinjaService service;
	
	
	@GetMapping("/")
	public String index() {
		return "redirect:/dojos";
	}
	@GetMapping("/dojos")
	public String dojo(@ModelAttribute("dojo") Dojo dojo) {
		return "dojopage.jsp";
	}
	@GetMapping("/ninjas")
	public String ninja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", service.allDojos());
		return "ninjaform.jsp";
	}
	@PostMapping("/dojos")
	public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
		Dojo newDojo = service.createDojo(dojo);
		return String.format("redirect:/dojos/%s",newDojo.getId());
	}
	@PostMapping("/ninjas")
	public String createNinja(@ModelAttribute("ninja") Ninja ninja) {
		ninja = service.createNinja(ninja);
		return "redirect:/"; 
	}
	
	@GetMapping("/dojos/{id}")
	public String showDojosById(@PathVariable("id")Long id, Model model) {
		Dojo dojo = service.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "showdojo.jsp";
	}

}
