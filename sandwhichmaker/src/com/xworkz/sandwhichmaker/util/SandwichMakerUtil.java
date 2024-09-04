package com.xworkz.sandwhichmaker.util;

import com.xworkz.sandwhichmaker.dto.SandwichMakerDto;

public class SandwichMakerUtil {
	public static boolean checkDuplicate(SandwichMakerDto[] listofsandwichdto,SandwichMakerDto dto) {
		System.out.println("check duplicate method is running...");
		for(SandwichMakerDto maker:listofsandwichdto)
		if(dto!=null && maker!=null && maker.equals(dto))
			return true;
		return false;
	}

}
