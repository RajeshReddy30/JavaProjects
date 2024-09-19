package com.xworkz.trcker.service;

import com.xworkz.trcker.dto.TrackingInformationDto;

public interface TrackerInformation {
	boolean setArraySize(int arraySize);
	String validateAndSave(TrackingInformationDto trackingInformationDto);
	void read();
	String updateByTrackerId(int trackerId,TrackingInformationDto trackingInformationDto);
	String deleteByProductName(String productName);
}
