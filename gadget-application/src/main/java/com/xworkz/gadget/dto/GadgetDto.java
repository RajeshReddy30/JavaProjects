package com.xworkz.gadget.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class GadgetDto {
	private int id;
	private int gadgetId;
	private String gadgetName;
	private String gadgetType;
	
	

}
