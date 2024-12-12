package com.xworkz.meta.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.meta.dto.MetaAppDto;
@Component
@RequestMapping
public class MetaAppController {

	@GetMapping("/submit")
	public String getResponce(@ModelAttribute MetaAppDto dto, Model model) {
		System.out.println("Received Data: " + dto);
		model.addAttribute("appDetails", dto);

		return "success.jsp";
	}

}
