package com.xworkz.superchaining;

public class BroilerChicken extends Chicken {

	boolean alive;
	double weight;

	BroilerChicken(int price, String location, boolean alive, double weight) {
		super(price, location);
		this.alive = alive;
		this.weight = weight;

	}

	void printInfo() {
		super.printInfo();
		System.out.println("printing info about broiler chicken");
		System.out.println("is broiler chicken alive? " + alive);
		System.out.println("weight of broiler chicken is :" + weight);
	}

}
