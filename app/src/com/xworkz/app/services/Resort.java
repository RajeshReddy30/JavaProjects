package com.xworkz.app.services;

import com.xworkz.app.Dto.ResortDto;
import com.xworkz.app.Util.ResortUtil;

public class Resort {
	private ResortDto resortdto[] = new ResortDto[3];
	private int index;

	public String onSave(ResortDto dto) {
		System.out.println("save method");
		if (dto == null) {
			return "not saved";
		} else {
			boolean duplicate = ResortUtil.checkDetails(resortdto, dto);
			if (duplicate == false) {
				if (this.index < resortdto.length) {
					resortdto[index] = dto;
					index++;

				}
			}
		}

		return "not saved";
	}

}
