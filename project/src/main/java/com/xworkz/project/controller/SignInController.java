package com.xworkz.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.project.service.ProjectService;

import lombok.AllArgsConstructor;
@RequestMapping("/")
@Controller
@AllArgsConstructor
public class SignInController {
	
	private ProjectService service;

	@PostMapping("/signin")
	public String signinSave(@RequestParam String email, @RequestParam String password, Model model) {
		System.out.println("SignIn Save Method is running");
		boolean result = service.findByEmailAndPassword(email, password);
		if (!result) {
			model.addAttribute("check", "Enter valid email and password");
			return "signin";
		}
		model.addAttribute("email", email);
		return "home";
	}

}
