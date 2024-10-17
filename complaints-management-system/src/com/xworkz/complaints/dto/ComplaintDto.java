package com.xworkz.complaints.dto;

import lombok.Data;

@Data
public class ComplaintDto {

	private int id; 
	private int userid;
	private String Category;
	private String Assignedto;
	private String Prioritylevel;
	private String ResolutionDate;
}
