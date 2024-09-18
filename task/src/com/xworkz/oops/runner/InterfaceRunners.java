package com.xworkz.oops.runner;

import com.xworkz.oops.service.Appliance;
import com.xworkz.oops.service.ApplianceImplementation;
import com.xworkz.oops.service.Device;
import com.xworkz.oops.service.DeviceImplementation;
import com.xworkz.oops.service.Vehicle;
import com.xworkz.oops.service.VehicleImplementation;

public class InterfaceRunners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vehicle vehicle=new VehicleImplementation();
vehicle.fuelType();
vehicle.maxSpeed();
vehicle.start();
vehicle.stop();
Vehicle.printVehicleInfo();
Vehicle.printCommonRules();
System.out.println("...........");
Appliance appliance=new ApplianceImplementation();
appliance.brand();
appliance.turnOff();
appliance.turnOn();
appliance.voltage();
Appliance.energyEfficiencyRating();
Appliance.warrantyPeriod();
System.out.println("............");
Device device=new DeviceImplementation();
device.connectivity();
device.powerOff();
device.powerOn();
device.softwareVersion();
Device.deviceCategory();
Device.deviceUsage();
	}

}
