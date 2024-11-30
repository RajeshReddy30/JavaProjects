package com.xworkz.cricket.repository;

import java.util.List;

import com.xworkz.cricket.dto.CricketDto;


public interface CricketRepository {
    boolean save(CricketDto dto);
    List<CricketDto> read();
    CricketDto searchById(int id);
    boolean delete(int id);
}
