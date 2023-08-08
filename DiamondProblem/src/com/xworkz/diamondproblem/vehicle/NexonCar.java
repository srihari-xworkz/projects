package com.xworkz.diamondproblem.vehicle;

public interface NexonCar extends Vehicle {

	default void cost() {
		System.out.println("Nexon costs 15lakhs");
	}
}
