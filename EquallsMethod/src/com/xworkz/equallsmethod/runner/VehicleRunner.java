package com.xworkz.equallsmethod.runner;

import com.xworkz.equallsmethod.app.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {

		System.out.println("main of VehicleRunner....");

		Vehicle vehicle = new Vehicle("two wheeler", "bike", 2, 45.30, 65000);
		System.out.println(vehicle);

		Vehicle vehicle2 = new Vehicle("four wheeler", "car", 4, 45.30, 65000);
		System.out.println(vehicle2);

		boolean check = vehicle.equals(vehicle2);
		System.out.println(check);

	}

}
