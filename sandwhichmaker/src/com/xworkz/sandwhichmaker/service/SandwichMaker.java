package com.xworkz.sandwhichmaker.service;

import com.xworkz.sandwhichmaker.dto.SandwichMakerDto;
import com.xworkz.sandwhichmaker.util.SandwichMakerUtil;

public class SandwichMaker {
	int index = 0;
	private SandwichMakerDto[] listofsandwichdto;

	public SandwichMaker(int arraySize) {
		this.listofsandwichdto = new SandwichMakerDto[arraySize];
	}

	public int getArrayLength() {
		return listofsandwichdto.length;
	}

	public String onSave(SandwichMakerDto sandwichdto) {
		boolean checkDuplicate = SandwichMakerUtil.checkDuplicate(listofsandwichdto, sandwichdto);
		if (sandwichdto != null && !checkDuplicate) {
			if (this.index < listofsandwichdto.length) {
				listofsandwichdto[index] = sandwichdto;
				index++;
				return "Saved successfully";
			} else {
				return "Array is full, cannot save more sandwiches.";
			}
		}
		return "Not saved";
	}

	public SandwichMakerDto read(int index) {
		if ( index < listofsandwichdto.length) {
			return listofsandwichdto[index];
		}
		return null;
	}

	public SandwichMakerDto search(String sandwichType) {
		for (SandwichMakerDto dto : listofsandwichdto) {
			if (dto != null && dto.getSandwichType().equalsIgnoreCase(sandwichType)) {
				return dto;
			}
		}
		return null;
	}
}

