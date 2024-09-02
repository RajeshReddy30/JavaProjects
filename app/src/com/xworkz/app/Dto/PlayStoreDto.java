package com.xworkz.app.Dto;

import java.time.LocalDate;

public class PlayStoreDto {
	private String applicationName;
	private String applicationType;
	private String applicationSize;
	private LocalDate createdDate;

	public PlayStoreDto() {
		System.out.println("no arguments constructor");
	}

	public PlayStoreDto(String applicationName, String applicationType, String applicationSize, LocalDate createdDate) {
		super();
		this.applicationName = applicationName;
		this.applicationType = applicationType;
		this.applicationSize = applicationSize;
		this.createdDate = createdDate;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	public String getApplicationSize() {
		return applicationSize;
	}

	public void setApplicationSize(String applicationSize) {
		this.applicationSize = applicationSize;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicationName == null) ? 0 : applicationName.hashCode());
		result = prime * result + ((applicationSize == null) ? 0 : applicationSize.hashCode());
		result = prime * result + ((applicationType == null) ? 0 : applicationType.hashCode());
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayStoreDto other = (PlayStoreDto) obj;
		if (applicationName == null) {
			if (other.applicationName != null)
				return false;
		} else if (!applicationName.equals(other.applicationName))
			return false;
		if (applicationSize == null) {
			if (other.applicationSize != null)
				return false;
		} else if (!applicationSize.equals(other.applicationSize))
			return false;
		if (applicationType == null) {
			if (other.applicationType != null)
				return false;
		} else if (!applicationType.equals(other.applicationType))
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PlayStoreDto [applicationName=" + applicationName + ", applicationType=" + applicationType
				+ ", applicationSize=" + applicationSize + ", createdDate=" + createdDate + "]";
	}

}
