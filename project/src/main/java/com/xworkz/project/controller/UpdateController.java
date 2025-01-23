package com.xworkz.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.project.dto.ProjectDto;
import com.xworkz.project.service.ProjectService;

@RequestMapping("/")
@Component
public class UpdateController {

	@Autowired
	private ProjectService service;

	@GetMapping("update")
	public String updateForm(@RequestParam String email, Model model) {
		ProjectDto dto = service.findByEmail(email);
		System.out.println(dto);
		model.addAttribute("updateResult", dto);
		return "update";
	}

	@PostMapping("update")  
	public String getUpdate(@ModelAttribute ProjectDto dto, Model model) {
		boolean updateResult = service.updateByEmail(dto);
		System.out.println(updateResult);
		if (updateResult) {
			model.addAttribute("updateResult", updateResult);
			return "home";
		}
		return "update";
	}

}
