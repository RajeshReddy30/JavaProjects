package com.xworkz.oops.runner;

import com.xworkz.oops.service.Appliance;
import com.xworkz.oops.service.Car;
import com.xworkz.oops.service.Device;
import com.xworkz.oops.service.Guitar;
import com.xworkz.oops.service.Instrument;
import com.xworkz.oops.service.Laptop;
import com.xworkz.oops.service.Vehicle;
import com.xworkz.oops.service.WashingMachine;

public class InterfaceRunner {

	public static void main(String[] args) {

		Vehicle car = new Car();
		car.start();
		car.accelerate();
		car.stop();
System.out.println(".,.,..,.,.,..,.,");
		Appliance washingMachine = new WashingMachine();
		washingMachine.turnOn();
		washingMachine.increasePower();
		washingMachine.turnOff();
		System.out.println("................");
		Device laptop = new Laptop();
		laptop.bootUp();
		laptop.reset();
		laptop.shutDown();
		System.out.println("................./");
		Instrument guitar = new Guitar();
		guitar.play();
		guitar.tune();
		guitar.stopPlaying();
	}
}
