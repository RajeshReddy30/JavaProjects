package com.xworkz.ticket.service;

import com.xworkz.ticket.dto.BookMyShowDto;

public interface BookMyShow {
	boolean setArraySize(int arraySize);
	 String validateAndSave(BookMyShowDto bookMyShowDto);
	void read();

}
