package com.xworkz.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.project.admin.AdminService;
import com.xworkz.project.service.ProjectService;
@RequestMapping("/")
@Component
public class AdminController {
	@Autowired
	private AdminService service;

	@PostMapping("/admin")
	public String Adminsignin(@RequestParam String email, @RequestParam String password, Model model) {
		System.out.println("admin SignIn Save Method is running");
		boolean result = service.findByEmailAndPassword(email, password);
		if (!result) {
			model.addAttribute("check", "Enter valid email and password");
			return "admin";
		}
		model.addAttribute("email", email);
		return "view";
	}

}
