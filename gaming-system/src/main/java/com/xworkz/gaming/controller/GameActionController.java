package com.xworkz.gaming.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.gaming.dto.PlayerActionDto;
import com.xworkz.gaming.service.GameActionService;

@RequestMapping
@Component
public class GameActionController {

    @Autowired
    private GameActionService service;

    @PostMapping("/submit")
    public String processPlayerAction(@ModelAttribute PlayerActionDto dto, Model model) {
        dto.actionTimestamp = LocalDateTime.now();
        model.addAttribute("details", dto);

        boolean result = service.savePlayerAction(dto);
        if (!result) {
            model.addAttribute("errorDetails", dto);
            return "fail";
        }
        return "success";
    }
}
