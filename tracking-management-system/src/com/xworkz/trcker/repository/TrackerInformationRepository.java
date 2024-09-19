package com.xworkz.trcker.repository;

import com.xworkz.trcker.dto.TrackingInformationDto;

public interface TrackerInformationRepository {
	boolean setArraySize(int arraySize);
	boolean onSave(TrackingInformationDto trackingInformationDto);
	TrackingInformationDto[] read();
	boolean duplicateCheck(TrackingInformationDto trackingInformationDto);
	boolean updateByTrackerId(int trackerId,TrackingInformationDto trackingInformationDto);
	boolean deleteByProductName(String productName);
}
