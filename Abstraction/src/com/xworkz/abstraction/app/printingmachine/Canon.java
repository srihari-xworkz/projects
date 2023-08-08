package com.xworkz.abstraction.app.printingmachine;

public class Canon implements PrintingMachine {

	@Override
	public void print() {
		System.out.println("implementing abstract print() of printingmachine");
	}

}
