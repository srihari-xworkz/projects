package com.xworkz.superchaining;

public class FarmChicken extends Chicken {

	int noOfDays;
	String careTaker;

	FarmChicken(int price, String location, int noOfDays, String careTaker) {
		super(price, location);
		this.noOfDays = noOfDays;
		this.careTaker = careTaker;

	}

	void printInfo() {
		super.printInfo();
		System.out.println("printing info about FarmChicken");
		System.out.println("no of days is :" + noOfDays);
		System.err.println("care Taker name is :" + careTaker);
	}

}
