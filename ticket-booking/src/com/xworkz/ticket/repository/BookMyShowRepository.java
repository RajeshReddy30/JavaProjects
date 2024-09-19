package com.xworkz.ticket.repository;

import com.xworkz.ticket.dto.BookMyShowDto;

public interface BookMyShowRepository {
	boolean setArraySize(int arraySize);

	boolean onSave(BookMyShowDto bookMyShowDto);

	BookMyShowDto[] read();

	boolean duplicateCheck(BookMyShowDto bookMyShowDto);
}
