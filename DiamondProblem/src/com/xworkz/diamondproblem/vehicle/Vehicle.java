package com.xworkz.diamondproblem.vehicle;

public interface Vehicle {

	public void electric();

	default void type() {
		System.out.println("invoking default method of vehicle interface");
	}

}
