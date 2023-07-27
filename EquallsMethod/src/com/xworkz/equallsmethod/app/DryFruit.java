package com.xworkz.equallsmethod.app;

public class DryFruit {
	private String name;
	private int number;
	private String isFor;
	private double protien;
	private int forDays;
	private int quantity;

	@Override
	public String toString() {

		return "name: " + name + " number: " + number + " isFor: " + isFor + " protien: " + protien + "forDays: "
				+ forDays + " quantity: " + quantity;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("not null, can compare");
			if (obj instanceof DryFruit) {
				System.out.println("both are same");
				DryFruit cast = (DryFruit) obj;
				if (this.name == cast.name && this.number == cast.number && this.isFor == isFor
						&& this.protien == protien && this.forDays == forDays && this.quantity == quantity) {
					return true;
				} else {
					System.err.println("both are not same");
				}
			} else {
				System.err.println("type mismatch");
			}
		} else {
			System.err.println("null, cannot compare");
		}
		return false;
	}

	public DryFruit() {
		super();
	}

	public DryFruit(String name, int number, String isFor, double protien, int forDays, int quantity) {
		super();
		this.name = name;
		this.number = number;
		this.isFor = isFor;
		this.protien = protien;
		this.forDays = forDays;
		this.quantity = quantity;
	}

}
