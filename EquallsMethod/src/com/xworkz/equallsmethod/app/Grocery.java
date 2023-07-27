package com.xworkz.equallsmethod.app;

public class Grocery {
	private String shopName;
	private String types;

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Argument is not null,can compare");
			if (obj instanceof Grocery) {
				System.out.println("instance type matched");
				Grocery cast = (Grocery) obj;
				if (this.shopName == cast.shopName && this.types == cast.types) {
					System.out.println("instances are same");
					return true;
				} else {
					System.err.println("Both are not same");
				}
			} else {
				System.err.println("type mismatch");
			}
		} else {
			System.err.println("Argument is null,cannot compare");
		}
		return false;

	}

	@Override
	public String toString() {
		return " ShopName: " + shopName + " Types: " + types;
	}

	public Grocery() {
		super();
	}

	public Grocery(String shopName, String types) {
		super();
		System.out.println("Invoking String,String const of Grocery");
		this.shopName = shopName;
		this.types = types;
	}

}
