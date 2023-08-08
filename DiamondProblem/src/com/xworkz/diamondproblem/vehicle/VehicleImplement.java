package com.xworkz.diamondproblem.vehicle;

public class VehicleImplement implements KiaCar, NexonCar {

	@Override
	public void electric() {
		System.out.println("invoking abstract method of Vehicle");
	}

}
