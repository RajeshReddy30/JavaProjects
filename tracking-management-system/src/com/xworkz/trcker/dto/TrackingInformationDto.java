package com.xworkz.trcker.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString

public class TrackingInformationDto {
	private int trackerId;
	private String packageName;
	private String fromLocation;
	private String toLocation;
	private LocalDateTime packedDate;
	private LocalDateTime dispatchedDate;

}
