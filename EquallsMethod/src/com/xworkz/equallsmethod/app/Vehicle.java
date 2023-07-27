package com.xworkz.equallsmethod.app;

public class Vehicle {
	private String type;
	private String name;
	private int wheels;
	private double milage;
	private double cost;

	@Override
	public String toString() {

		return "type: " + type + " name: " + name + " wheels: " + wheels + " milage: " + milage + "cost: " + cost;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("not null, can compare");
			if (obj instanceof Vehicle) {
				System.out.println("both are same");
				Vehicle cast = (Vehicle) obj;
				if (this.type == cast.type && this.name == cast.name && this.wheels == wheels && this.milage == milage
						&& this.cost == cost) {
					return true;
				} else {
					System.out.println("both are not same");
				}
			} else {
				System.err.println("type mismatch");
			}
		} else {
			System.out.println("null, cannot compare");
		}
		return false;
	}

	public Vehicle() {
		super();
	}

	public Vehicle(String type, String name, int wheels, double milage, double cost) {
		super();
		this.type = type;
		this.name = name;
		this.wheels = wheels;
		this.milage = milage;
		this.cost = cost;
	}

}
