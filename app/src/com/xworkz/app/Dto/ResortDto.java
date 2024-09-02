package com.xworkz.app.Dto;

public class ResortDto {
	private String resortName;
	private String location;
	private double rating;
	private String resortType;
	public ResortDto() {
		System.out.println("no arguments constructor");
	}
	public ResortDto(String resortName, String location, double rating, String resortType) {
		super();
		this.resortName = resortName;
		this.location = location;
		this.rating = rating;
		this.resortType = resortType;
	}
	public String getResortName() {
		return resortName;
	}
	public void setResortName(String resortName) {
		this.resortName = resortName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getResortType() {
		return resortType;
	}
	public void setResortType(String resortType) {
		this.resortType = resortType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		long temp;
		temp = Double.doubleToLongBits(rating);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((resortName == null) ? 0 : resortName.hashCode());
		result = prime * result + ((resortType == null) ? 0 : resortType.hashCode());
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
		ResortDto other = (ResortDto) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
			return false;
		if (resortName == null) {
			if (other.resortName != null)
				return false;
		} else if (!resortName.equals(other.resortName))
			return false;
		if (resortType == null) {
			if (other.resortType != null)
				return false;
		} else if (!resortType.equals(other.resortType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ResortDto [resortName=" + resortName + ", location=" + location + ", rating=" + rating + ", resortType="
				+ resortType + "]";
	}

}
