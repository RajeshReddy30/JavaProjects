package com.xworkz.trcker.runner;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.xworkz.trcker.dto.TrackingInformationDto;
import com.xworkz.trcker.service.TrackerInformation;
import com.xworkz.trcker.service.TrackerInformationImplimentation;

public class TrackerInformationRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int arraySize = scanner.nextInt();

        TrackingInformationDto tracker = new TrackingInformationDto(987790, "mobile", "Ganesh mobiles", "BTM", LocalDateTime.of(2024, 9, 17, 12, 34), LocalDateTime.of(2024, arraySize, arraySize, arraySize, arraySize));
        TrackingInformationDto tracker1 = new TrackingInformationDto(987790, "mobile", "kr puram", "BTM", LocalDateTime.of(2024, 9, 17, 12, 34), LocalDateTime.of(2024, arraySize, arraySize, arraySize, arraySize));
        TrackingInformationDto tracker2 = new TrackingInformationDto(987791, "Laptop", "Tech World", "Koramangala", LocalDateTime.of(2024, 9, 15, 11, 30), LocalDateTime.now().plusDays(4));

        TrackerInformation trackerInformation = new TrackerInformationImplimentation();
        trackerInformation.setArraySize(arraySize);
        System.out.println(trackerInformation.validateAndSave(tracker));
        System.out.println(trackerInformation.validateAndSave(tracker1));

        trackerInformation.read();
        System.out.println(trackerInformation.updateByTrackerId(987791, tracker2));

        trackerInformation.read();
        trackerInformation.deleteByProductName("mobile");
        trackerInformation.read();

        scanner.close();
    }
}

