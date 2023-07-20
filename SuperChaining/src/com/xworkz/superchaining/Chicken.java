package com.xworkz.superchaining;

public class Chicken {

	int price;
	String location;

	Chicken(int price, String location) {
		super();
		this.price = price;
		this.location = location;
	}

	void printInfo() {
		System.out.println("printing info about Chicken");
		System.out.println("price of chicken :" + price);
		System.out.println("location is :" + location);
	}

}
