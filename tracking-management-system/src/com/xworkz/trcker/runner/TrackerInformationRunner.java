package com.xworkz.trcker.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import com.xworkz.trcker.dto.TrackingInformationDto;
import com.xworkz.trcker.service.TrackerInformation;
import com.xworkz.trcker.service.TrackerInformationImplimentation;

public class TrackerInformationRunner {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the array size:");
	int	arraySize=scanner.nextInt();
		TrackingInformationDto tracker=new TrackingInformationDto();
		
		tracker.setTrackerId(987790);
		tracker.setPackageName("mobile");
		tracker.setFromLocation("Ganesh mobiles");
		tracker.setToLocation("BTM");
		tracker.setPackedDate(LocalDateTime.of(2024, 9, 17, 12, 34));
		tracker.setDispatchedDate(LocalDateTime.of(2024, arraySize, arraySize, arraySize, arraySize));
		TrackingInformationDto tracker1 = new TrackingInformationDto();
        tracker1.setTrackerId(987790);
        tracker1.setPackageName("mobile");
        tracker1.setFromLocation("Ganesh mobiles");
        tracker1.setToLocation("BTM");
        tracker1.setPackedDate(LocalDateTime.of(2024, 9, 17, 12, 34));
        tracker1.setDispatchedDate(LocalDateTime.of(2024, arraySize, arraySize, arraySize, arraySize));
       
		TrackingInformationDto tracker2 = new TrackingInformationDto();
        tracker2.setTrackerId(987791);
        tracker2.setPackageName("Laptop");
        tracker2.setFromLocation("Tech World");
        tracker2.setToLocation("Koramangala");
        tracker2.setPackedDate(LocalDateTime.of(2024, 9, 15, 11, 30));
        tracker2.setDispatchedDate(LocalDateTime.now().plusDays(4));
      
	
		TrackerInformation trackerinformation=new TrackerInformationImplimentation();
		trackerinformation.setArraySize(arraySize);
		System.out.println(trackerinformation.validateAndSave(tracker));
		  System.out.println(trackerinformation.validateAndSave(tracker2));
		  System.out.println(trackerinformation.validateAndSave(tracker1));
		trackerinformation.read();
	}

}
