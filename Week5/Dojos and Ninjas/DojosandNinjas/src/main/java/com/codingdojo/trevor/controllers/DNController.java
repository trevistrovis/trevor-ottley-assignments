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
import com.codingdojo.trevor.services.DojoService;
import com.codingdojo.trevor.services.NinjaService;

@Controller
public class DNController {
	@Autowired
	private DojoService dojos;
	
	@Autowired
	private NinjaService ninjas;
	
	@GetMapping("/")
	public String index() {
		return "redirect:/dojos";
	}
	@GetMapping("/dojos")
	public String dojoForm(@ModelAttribute("dojo") Dojo dojo) {
		return "dojopage.jsp";
	}
	@GetMapping("/ninjas")
	public String ninjaForm(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojos.all());
		return "ninjaform.jsp";
	}
	@PostMapping("/dojos")
	public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
		
		Dojo newDojo = dojos.create(dojo);
		System.out.printf("new id: %s", dojo.getId());
		
		return String.format("redirect:/dojos/%s",newDojo.getId());
	}
	@PostMapping("/ninjas")
	public String createNinja(@ModelAttribute("ninja") Ninja ninja) {
		ninja = ninjas.create(ninja);
		return "redirect:/dojos/" + ninja.getDojo().getId();
	}
	
	@GetMapping("/dojos/{id}")
	public String showDojos(@PathVariable("id")Long id, Model model) {
		Dojo dojo = dojos.find(id);
		model.addAttribute("dojo", dojo);
		return "showdojo.jsp";
	}

}
