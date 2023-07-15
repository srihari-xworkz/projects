package com.xworkz.associationTask;

public class OwnerRuner {

	public static void main(String[] args) {
		System.out.println("running main of Hotel-Owner associatio");
		Owner owner = new Owner("jamshetji","1902", 2500.00, false);
		owner.printInfo();
	}

}
