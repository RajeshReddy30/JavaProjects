package com.xworkz.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.project.dto.ProjectDto;
import com.xworkz.project.service.ProjectServiceImp;

@Controller
@RequestMapping("/")
@Component
public class SignUpController {
	
	private SignUpController() {
		System.out.println("Project Controller");
	}
	
	@Autowired
	private ProjectServiceImp service;
	
	@PostMapping("/submit")
	public String signupSave(@ModelAttribute ProjectDto dto,Model model) {
	    System.out.println("SignUp Save Method is running");
	    boolean result = service.signUpSave(dto);
	    if (!result) {
	        model.addAttribute("check", "Enter Proper Details");
	        return "signup";
	    }
	    model.addAttribute("Save", dto);
	    return "signin";
	}
	
	

}