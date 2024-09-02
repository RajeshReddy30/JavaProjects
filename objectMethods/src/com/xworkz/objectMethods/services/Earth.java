package com.xworkz.objectMethods.services;

import com.xworkz.objectMethods.constant.Days;
import com.xworkz.objectMethods.constant.Months;
import com.xworkz.objectMethods.constant.Places;
import com.xworkz.objectMethods.constant.Planet;


public class Earth {
	public Months monthsName;
	public Days daysName;
	public Planet planetNames;
	public Places placeNames;
	//public String dayName;
	
	public Earth(Months monthsName, Days daysName, Planet planetNames, Places placeNames) {
		
		this.monthsName = monthsName;
		this.daysName = daysName;
		this.planetNames = planetNames;
		this.placeNames = placeNames;
	}
	
	@Override
	public int hashCode() {
		int result = 0;
		result = 27 * result + ((daysName == null) ? 0 : daysName.hashCode());
		result = 23 * result + ((monthsName == null) ? 0 : monthsName.hashCode());
		result = 31 * result + ((placeNames == null) ? 0 : placeNames.hashCode());
		result = 7 * result + ((planetNames == null) ? 0 : planetNames.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object object) {
		if(object==null||this==null)
			return false;
		if(this==object)
			return true;
		if(!(object instanceof Earth))
			return false;
		Earth earth=(Earth)object;
		if(!this.monthsName.equals(earth.monthsName)||
				!this.daysName.equals(earth.daysName)||!this.planetNames.equals(earth.planetNames)||
				!this.placeNames.equals(earth.placeNames))
			return false;
			
		return true;
	}
	@Override
	public String toString() {
		return "Earth :[monthsName=" + monthsName + ", daysName=" + daysName + ", planetNames=" + planetNames
				+ ", placeNames=" + placeNames + "]";
	}
	

}
