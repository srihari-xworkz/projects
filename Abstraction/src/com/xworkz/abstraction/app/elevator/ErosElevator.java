package com.xworkz.abstraction.app.elevator;

public class ErosElevator {
	private Elevator elevator;

	public ErosElevator(Elevator elevator) {
		this.elevator = elevator;
		System.out.println("elevator arg const of erosElevator");
	}

	public void check() {
		if (elevator != null) {
			System.out.println("not null");
			this.elevator.carryLuggae();
		} else {
			System.out.println("null");
		}
	}
}
