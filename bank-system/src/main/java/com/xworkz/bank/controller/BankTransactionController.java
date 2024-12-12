package com.xworkz.bank.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bank.dto.BankTransactionDto;
import com.xworkz.bank.service.BankTransactionService;

@RequestMapping
@Component
public class BankTransactionController {

    @Autowired
    private BankTransactionService service;

    @PostMapping("/submit")
    public String processTransaction(@ModelAttribute BankTransactionDto dto, Model model) {
        dto.setTransactionTimestamp(LocalDateTime.now());
        model.addAttribute("details", dto);

        boolean result = service.saveTransaction(dto);
        if (!result) {
            model.addAttribute("errorDetails", dto);
            return "fail";
        }
        return "success";
    }
}

