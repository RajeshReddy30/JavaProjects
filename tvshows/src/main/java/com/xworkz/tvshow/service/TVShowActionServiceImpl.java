package com.xworkz.tvshow.service;



import org.springframework.stereotype.Component;

import com.xworkz.tvshow.dto.TVShowActionDto;

@Component
public class TVShowActionServiceImpl implements TVShowActionService {

    @Override
    public boolean saveTVShowAction(TVShowActionDto dto) {
        if (dto != null) {
            if (dto.getViewingTime() > 0 && dto.getActionType() != null && !dto.getActionType().isEmpty()) {
                System.out.println("TV Show action saved successfully");
                return true;
            }
        }
        System.out.println("TV Show action failed");
        return false;
    }
}
