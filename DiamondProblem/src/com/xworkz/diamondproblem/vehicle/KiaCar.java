package com.xworkz.diamondproblem.vehicle;

public interface KiaCar extends Vehicle {

	default void mileage() {
		System.out.println("this has a mileage of about 60km");
	}

}
