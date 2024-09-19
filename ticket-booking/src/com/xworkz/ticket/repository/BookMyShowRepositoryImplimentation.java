package com.xworkz.ticket.repository;

import com.xworkz.ticket.dto.BookMyShowDto;


public class BookMyShowRepositoryImplimentation implements BookMyShowRepository  {
	BookMyShowDto listOfArray[];
	private int index=0;
	@Override
	public boolean setArraySize(int arraySize) {
		listOfArray = new BookMyShowDto[arraySize];
		if (arraySize == listOfArray.length) {
			System.out.println("array is initilised");
			return true;
		} else {
			System.out.println("array is not initialised");
		}
		return false;
	}

@Override
public boolean onSave(BookMyShowDto bookMyShowDto) {
	if(listOfArray!=null) {
	if (this.index < this.listOfArray.length) {
		listOfArray[index] = bookMyShowDto;
		index++;
		return true;
	}}
	return false;
}



@Override
public BookMyShowDto[] read() {
	
	return listOfArray;
}




@Override
public boolean duplicateCheck(BookMyShowDto bookMyShowDto) {
	
	if (bookMyShowDto != null ) {
		for (BookMyShowDto trackerDto : listOfArray) {
			
			if (trackerDto != null && trackerDto.equals(bookMyShowDto)) {
				System.out.println("Duplicate found: " +trackerDto );
				return true; 
			}
		}
	}
	System.out.println("No duplicates found");
	return false; 
}

}

