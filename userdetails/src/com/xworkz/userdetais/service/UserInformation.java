package com.xworkz.userdetais.service;

import java.util.Arrays;

import com.xworkz.userdetais.abstracts.AbstractUserInformation;
import com.xworkz.userdetais.dto.UserDetailsDto;

public class UserInformation extends AbstractUserInformation {
	private UserDetailsDto dto[] = new UserDetailsDto[3];
	private int index = 0;

	@Override
	public String onSave(UserDetailsDto userDetailsDto) {
		System.out.println("on save method is running");

		if (userDetailsDto != null && userDetailsDto.getUserName() != null && !userDetailsDto.getUserName().isBlank()
				&& !userDetailsDto.getUserName().isEmpty() && userDetailsDto.getUserName().length() >= 3) {
			if (this.index < dto.length)
				dto[index] = userDetailsDto;

			System.out.println("saved into array:" + dto[index]);

			return "saved successfully";
		}

		return "not saved";
	}

	public boolean delete(String email) {
		if (email != null) {
			for (int i = 0, j = 0; i < dto.length; i++) {
				if (dto[i] != null && dto[i].getEmail().equalsIgnoreCase(email)) {
					dto[j++] = dto[i];
					return true;
				}

				dto = Arrays.copyOf(dto, j);
				System.out.println("Deleted successfully.");

			}
		}

		return false;
	}

	public UserDetailsDto read(UserDetailsDto userDetailsDto) {
		for (UserDetailsDto dtos : dto) {
			return dtos;
		}
		return userDetailsDto;
	}
}
