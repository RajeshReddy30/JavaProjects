package com.xworkz.trcker.repository;

import java.util.Arrays;

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
		if (listOfArray != null) {
			if (this.index < this.listOfArray.length) {
				listOfArray[index] = trackingInformationDto;
				index++;
				return true;
			}
		}
		return false;
	}

	@Override
	public TrackingInformationDto[] read() {

		return listOfArray;
	}

	@Override
	public boolean duplicateCheck(TrackingInformationDto trackingInformationDto) {

		if (trackingInformationDto != null) {
			for (TrackingInformationDto trackerDto : listOfArray) {

				if (trackerDto != null && trackerDto.equals(trackingInformationDto)) {
					System.out.println("Duplicate found: " + trackerDto);
					return true;
				}
			}
		}
		System.out.println("No duplicates found");
		return false;
	}

	@Override
	public boolean updateByTrackerId(int trackerId, TrackingInformationDto trackingInformationDto) {
		System.out.println("update method is running");
		if (trackerId != 0) {
			for (int i = 0; i < listOfArray.length; i++) {
				if (listOfArray[i] != null && listOfArray[i].getTrackerId()==trackerId) {
					System.out.println("update by trackerId");
					listOfArray[i].setFromLocation(trackingInformationDto.getFromLocation());
					listOfArray[i].setToLocation(trackingInformationDto.getToLocation());
					listOfArray[i].setPackageName(trackingInformationDto.getPackageName());
					listOfArray[i].setDispatchedDate(trackingInformationDto.getDispatchedDate());
					listOfArray[i].setPackedDate(trackingInformationDto.getPackedDate());
					return true;
				}
			}

		}
		return false;

	}

	
	@Override
	public boolean deleteByProductName(String productName) {

		if (productName != null) {
			for (int i = 0, j = 0; i < listOfArray.length; i++) {
				if (listOfArray[i] != null && listOfArray[i].equals(productName)) {
					listOfArray[j++] = listOfArray[i];
					return true;
				}

				listOfArray = Arrays.copyOf(listOfArray, j);
				System.out.println("Deleted successfully.");
			}

		}
		return false;
	}
}
