package com.xworkz.userdetais.abstracts;

import com.xworkz.userdetais.dto.UserDetailsDto;

public abstract class AbstractUserInformation  {
	public abstract String onSave(UserDetailsDto userDetailsDto);
	public abstract boolean delete(String email);
	public abstract UserDetailsDto read(UserDetailsDto userDetailsDto);
}
