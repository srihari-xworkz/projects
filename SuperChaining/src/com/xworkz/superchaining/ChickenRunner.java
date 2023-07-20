package com.xworkz.superchaining;

public class ChickenRunner {

	public static void main(String[] args) {
		Chicken ref1 = new Chicken(350, "mandya");
		ref1.printInfo();
		System.out.println();

		BroilerChicken ref2 = new BroilerChicken(450, "athithya", false, 1.25);
		ref2.printInfo();
		System.out.println();

		FarmChicken ref3 = new FarmChicken(380, "naseer biryani", 5, "vinod");
		ref3.printInfo();

	}

}
