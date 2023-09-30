package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public String form(@PathVariable("routeParam") String routeParam,  Model model, CoachingForm CoachingForm) {
		model.addAttribute("coachingForm", CoachingForm);
		return "form";
	}
	
	@PostMapping("/create")
	@ResponseBody
	public String create(CoachingForm coachingForm) {
		return "登録データ" + coachingForm.getData();
	}
	
	@GetMapping("/create")
	public String ceate(@ModelAttribute CoachingForm coachingForm) {
		return "complete";
	}
}
