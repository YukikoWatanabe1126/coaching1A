package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/index")
public class CoachingController {
	
	@GetMapping
	public String index(@RequestParam("food") String food, @RequestParam("drink") String drink, Model model) {
		model.addAttribute("food", food);
		model.addAttribute("drink", drink);
		return "index";
	}
	
}
