package com.xworkz.association;

public class DirectorRunner {

	public static void main(String[] args) {
		System.out.println("running main to print Movie Director association");
		System.out.println();
		Director director2 = new Director("rajamouli", "dharma", 120, "hyderabad");
		director2.printInfo();
		
	}

}
