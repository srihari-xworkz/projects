package com.xworkz.equallsmethod.app;

public class Slipper {
	private String name;
	private int cost;
	private String type;
	private String idealFor;
	private String color;
	private int warranty;
	private String country;

	@Override
	public String toString() {
		return "name: " + name + " cost: " + cost + " type: " + type + " idealFor: " + idealFor + " color: " + color
				+ " warranty: " + warranty + " country: " + country;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("not null, can compare");
			if (obj instanceof Slipper) {
				System.out.println("both are same");
				Slipper cast = (Slipper) obj;
				if (this.name == cast.name && this.cost == cast.cost && this.type == type && this.idealFor == idealFor
						&& this.color == color && this.warranty == warranty && this.country == country) {
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

	public Slipper() {
		super();
	}

	public Slipper(String name, int cost, String type, String idealFor, String color, int warranty, String country) {
		super();
		this.name = name;
		this.cost = cost;
		this.type = type;
		this.idealFor = idealFor;
		this.color = color;
		this.warranty = warranty;
		this.country = country;
	}

}
