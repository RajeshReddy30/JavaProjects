package com.xworkz.cricket.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CricketDto {
    private int id;
	private String teamName;
	private String teamBoard;
	private String Captain;
	private String Coach;
	private int matchesPlayed;
	private int matchesWon;
	private int worldCupsWon;

}
