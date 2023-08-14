package com.xworkz.crudoperations.runner;

import com.xworkz.crudoperations.app.ApartmentRepoImpl;
import com.xworkz.crudoperations.app.ApartmentRepository;

public class ApartmentRunner {

	public static void main(String[] args) {

		ApartmentRepository apart = new ApartmentRepoImpl();
		apart.save("gohar");
		apart.save("nilaya");
		apart.save("skyline");
		apart.save("tower");
		apart.save("shree");

		System.out.println();

		apart.display();
	}

}
