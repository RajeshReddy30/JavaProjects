package com.xworkz.tvshow.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.tvshow.dto.TVShowActionDto;
import com.xworkz.tvshow.service.TVShowActionService;

@RequestMapping
@Component
public class TVShowActionController {

    @Autowired
    private TVShowActionService service;

    @PostMapping("/submit")
    public String processViewerAction(@ModelAttribute TVShowActionDto dto, Model model) {
        dto.setCreatedOn(LocalDateTime.now());
        dto.setCreatedBy("Admin");
        model.addAttribute("details", dto);

        boolean result = service.saveTVShowAction(dto);
        if (!result) {
            model.addAttribute("errorDetails", dto);
            return "fail";
        }
        return "success";
    }
}

