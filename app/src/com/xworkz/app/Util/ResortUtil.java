package com.xworkz.app.Util;

import com.xworkz.app.Dto.ResortDto;

public class ResortUtil {
	public static boolean checkDetails(ResortDto[] resortdto,ResortDto dto) {
		System.out.println("duplicate check");
		for(ResortDto resorts:resortdto) {
			if(resortdto!=null && resortdto.equals(dto)) {
				return true;
			}
		}
		return false;
	}

}
