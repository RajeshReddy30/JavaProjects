package com.xworkz.gaming.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.gaming.dto.PlayerActionDto;
import com.xworkz.gaming.service.GameActionService;

@RequestMapping
@Component
public class GameActionController {

    @Autowired
    private GameActionService service;

    @PostMapping("/submit")
    public String processPlayerAction(@ModelAttribute PlayerActionDto dto, Model model) {
        dto.actionTime = LocalDateTime.now();
        model.addAttribute("details", dto);

        boolean result = service.savePlayerAction(dto);
        if (!result) {
            model.addAttribute("errorDetails", dto);
            return "fail";
        }
        return "success";
    }
    @GetMapping("/view")
	public String view(Model model) {
		model.addAttribute("views",service.findAll());
		return "view";
	}
    @GetMapping("/delete")
	public String deleteById(@RequestParam int id, Model model) {
	    String result = service.deleteById(id);
	    model.addAttribute("message", result);
	    return "view";
	}
	
	@GetMapping("/update")
	public String showUpdateForm(@RequestParam("id") int id, Model model) {
		PlayerActionDto dto = service.findById(id);
	    if (dto != null) {
	        model.addAttribute("message", dto);
	        return "update"; 
	    }
	    model.addAttribute("error", "TV Show not found");
	    return "error"; 
	}


	@PostMapping("/update")
	public String updateById(@ModelAttribute PlayerActionDto dto, Model model) {
	    String result = service.updateById(dto.getId(), dto);
	    model.addAttribute("message", result);
	    return "view"; 
	}
}
