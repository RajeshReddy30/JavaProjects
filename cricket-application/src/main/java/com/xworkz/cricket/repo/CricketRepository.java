package com.xworkz.cricket.repo;

import com.xworkz.cricket.dto.CricketDto;

public interface CricketRepository {
    boolean save(CricketDto dto);
}
