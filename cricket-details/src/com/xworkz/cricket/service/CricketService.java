package com.xworkz.cricket.service;

import java.util.List;

import com.xworkz.cricket.dto.CricketDto;

public interface CricketService {
    String validateAndSave(CricketDto dto);
    List<CricketDto> read();
    CricketDto searchById(int id);
    String delete(int id);
}
