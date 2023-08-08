package com.xworkz.diamondproblem.vehicle;

public class VehicleRunner {

	public static void main(String[] args) {

		Vehicle vehicle = new VehicleImplement();
		vehicle.electric();
		vehicle.type();

		KiaCar kia = new VehicleImplement();
		kia.electric();
		kia.mileage();
		kia.type();

		NexonCar nexon = new VehicleImplement();
		nexon.electric();
		nexon.type();
		nexon.cost();

		VehicleImplement vi = new VehicleImplement();
		vi.type();
		vi.cost();
		vi.mileage();
		vi.electric();
	}
}
