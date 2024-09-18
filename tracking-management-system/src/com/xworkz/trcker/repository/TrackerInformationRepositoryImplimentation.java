package com.xworkz.trcker.repository;

import com.xworkz.trcker.dto.TrackingInformationDto;

public class TrackerInformationRepositoryImplimentation implements TrackerInformationRepository {
	private int index = 0;
	private TrackingInformationDto[] listOfArray;

	@Override
	public boolean setArraySize(int arraySize) {
		listOfArray = new TrackingInformationDto[arraySize];
		if (arraySize == listOfArray.length) {
			System.out.println("array is initilised");
			return true;
		} else {
			System.out.println("array is not initialised");
		}
		return false;
	}

	@Override
	public boolean onSave(TrackingInformationDto trackingInformationDto) {
		if(listOfArray!=null) {
		if (this.index < this.listOfArray.length) {
			listOfArray[index] = trackingInformationDto;
			index++;
			return true;
		}}
		return false;
	}

	@Override
	public TrackingInformationDto[] read() {
		
		return listOfArray;
	}



	@Override
	public boolean duplicateCheck(TrackingInformationDto trackingInformationDto) {
		
		if (trackingInformationDto != null ) {
			for (TrackingInformationDto trackerDto : listOfArray) {
				
				if (trackerDto != null && trackerDto.equals(trackingInformationDto)) {
					System.out.println("Duplicate found: " +trackerDto );
					return true; 
				}
			}
		}
		System.out.println("No duplicates found");
		return false; 
	}

}
