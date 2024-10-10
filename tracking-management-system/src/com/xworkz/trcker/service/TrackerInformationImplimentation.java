package com.xworkz.trcker.service;

import com.xworkz.trcker.dto.TrackingInformationDto;
import com.xworkz.trcker.repository.TrackerInformationRepository;
import com.xworkz.trcker.repository.TrackerInformationRepositoryImplimentation;

public class TrackerInformationImplimentation implements TrackerInformation {
	TrackerInformationRepository repo=new TrackerInformationRepositoryImplimentation();
	@Override
	
	public boolean setArraySize(int arraySize) {
		if(arraySize>0) {
			System.out.println("entered array size is propper");
			
			repo.setArraySize(arraySize);
			return true;
		}else {
			System.out.println("entered array size is not proper, array size should be greater than 0");
		}
		return false;
	}

	@Override
	public String validateAndSave(TrackingInformationDto trackingInformationDto) {
		System.out.println("validate and save method is running");
		if(trackingInformationDto!=null) {
			System.out.println("TrackingInformationDto is not null");
			if(!repo.duplicateCheck(trackingInformationDto)) {
			repo.onSave(trackingInformationDto);
			return "saved successfully";
		}}
		return "not saved";
	}

	@Override
	public void read() {
		TrackingInformationDto[] trackerDto=repo.read();
		for(TrackingInformationDto Dto:trackerDto) {
			System.out.println("Tracking Details:"+Dto);
		}
		
	}

	@Override
	public String updateByTrackerId(int trackerId, TrackingInformationDto trackingInformationDto) {
		System.out.println("update method");
		if(trackerId!=0) {
			if(repo.updateByTrackerId(trackerId, trackingInformationDto)) {
			repo.updateByTrackerId(trackerId, trackingInformationDto);
			return "updated successfully";
		}}
		return "not updated";
	}

	@Override
	public String deleteByProductName(String productName) {
		if(productName!=null) {
			System.out.println("delete .....");
			if(repo.deleteByProductName(productName)) {
			repo.deleteByProductName(productName);
			return "deleted successfully";
		}}
		return "not deleted";
	}

}

