package com.xworkz.app.services;

import java.time.LocalDate;

import com.xworkz.app.Dto.PlayStoreDto;
import com.xworkz.app.Util.PlayStoreUtil;

public class PlayStore {
	private PlayStoreDto playstoredto[] = new PlayStoreDto[3];
	private int index = 0;

	public String onSave(PlayStoreDto dto) {
		System.out.println("on save method is running");
		if (dto == null) {
			return "dto is null :not saved";
		} else {
			boolean duplicate = PlayStoreUtil.checkDuplicates(playstoredto, dto);
			System.out.println("duplicate check is:" + duplicate);
			if (duplicate == false) {
				if (this.index < playstoredto.length) {
					playstoredto[index] = dto;
					index++;
					return "saved successfully";
				}
			}

		}
		return "not saved";
	}

	public void getAllelements() {
		for (PlayStoreDto dto : playstoredto) {
			System.out.println("array elements are:" + dto);
		}
	}

	public PlayStoreDto getByApplicationName(String applicationName) {
		System.out.println("get by application Name method is running");
		for (PlayStoreDto playstore : playstoredto) {
			if (playstore.getApplicationName().equalsIgnoreCase(applicationName)) {
				return playstore;

			}

		}
		return null;
	}

	public PlayStoreDto getByApplicationType(String applicationtype) {
		System.out.println("get by application type method is running");
		for (PlayStoreDto playstore : playstoredto) {
			if (playstore.getApplicationType().equalsIgnoreCase(applicationtype)) {
				return playstore;

			}

		}
		return null;
	}

	public PlayStoreDto getByCreatedDate(LocalDate date) {
		System.out.println("get by created date method is running");
		for (PlayStoreDto playstore : playstoredto) {
			if (playstore.getCreatedDate().equals(date)) {
				return playstore;

			}

		}
		return null;
	}
	public String updateByApplicationName(String applicationName, PlayStoreDto dto) {
        System.out.println("update by application Name method is running");
        for (int index = 0; index < playstoredto.length; index++) {
            if (playstoredto[index].getApplicationName().equalsIgnoreCase(applicationName)) {
                playstoredto[index] = dto;
                System.out.println("updated array is: " + playstoredto[index]);
                return "updated successfully";
            }
        }
        return "not updated";
    }

}
