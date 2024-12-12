package com.xworkz.tvshow.dto;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class TVShowActionDto {

    private String showName;
    private String viewerName;
    private int viewingTime;
    private String actionType;
    private String createdBy;
    private LocalDateTime createdOn;
}

