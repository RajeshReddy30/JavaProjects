package com.xworkz.tvshow.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    @GetMapping("/view")
	public String view(Model model) {
		model.addAttribute("views",service.findAll());
		return "view";
	}
	
	@GetMapping("/find")
	public String findById(@RequestParam int id, Model model) {
	    TvShowsDto dto = service.findById(id);
	    if (dto != null) {
	        model.addAttribute("details", dto);
	        return "view";
	    }
	    model.addAttribute("error", "TV Show not found");
	    return "error";
	}

	@GetMapping("/delete")
	public String deleteById(@RequestParam int id, Model model) {
	    String result = service.deleteById(id);
	    model.addAttribute("message", result);
	    return "view";
	}
	
	@GetMapping("/update")
	public String showUpdateForm(@RequestParam("id") int id, Model model) {
		TVShowActionDto dto = service.findById(id);
	    if (dto != null) {
	        model.addAttribute("message", dto);
	        return "update"; 
	    }
	    model.addAttribute("error", "TV Show not found");
	    return "error"; 
	}


	@PostMapping("/update")
	public String updateById(@ModelAttribute TVShowActionDto dto, Model model) {
	    String result = service.updateById(dto.getId(), dto);
	    model.addAttribute("message", result);
	    return "view"; 
	}
}

