package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.elevator.AirportElevator;
import com.xworkz.abstraction.app.elevator.Elevator;
import com.xworkz.abstraction.app.elevator.ErosElevator;

public class ElevatorRunner {
	public static void main(String[] args) {
		System.out.println("main of Elevator");
		Elevator elevator = new AirportElevator();
		ErosElevator eros = new ErosElevator(elevator);
		eros.check();

	}
}
