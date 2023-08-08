package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.Laptop.AmbaniLaptop;
import com.xworkz.abstraction.app.Laptop.DellLaptop;
import com.xworkz.abstraction.app.Laptop.Laptop;

public class LaptopRunner {

	public static void main(String[] args) {
		System.out.println("main of Laptop");
		Laptop lap = new DellLaptop();
		AmbaniLaptop ambani = new AmbaniLaptop(lap);
		ambani.check();
	}

}
