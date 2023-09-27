package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.form.CoachingForm;

@Controller
@RequestMapping
public class CoachingController {
	
	@GetMapping("/index")
	public String index(@RequestParam("food") String food, @RequestParam("drink") String drink, Model model) {
		model.addAttribute("food", food);
		model.addAttribute("drink", drink);
		return "index";
	}
	
	@GetMapping("/form/{routeParam}")
	public String form(@PathVariable("routeParam") String routeParam,  Model model) {
		CoachingForm coachingForm = new CoachingForm();
		coachingForm.setRouteParam(routeParam);
		model.addAttribute("coachingForm", coachingForm);
		return "form";
	}
}
