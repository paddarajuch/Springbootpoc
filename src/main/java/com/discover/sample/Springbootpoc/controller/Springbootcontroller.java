package com.discover.sample.Springbootpoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Springbootcontroller {
	@GetMapping("/wishMe")
	public String  greeting(@RequestParam("name") String name,Model model) {
		String message= "Hi " + name +" Welcome to spring Cloud application";
		model.addAttribute("message", message);
		return "home";
		

	}

}
