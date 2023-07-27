package com.xworkz.equallsmethod.runner;

import com.xworkz.equallsmethod.app.Slipper;

public class SlipperRunner {

	public static void main(String[] args) {

		Slipper slipper = new Slipper("paragon", 400, "chappal", "all", "white", 8, "india");
		System.out.println(slipper);

		Slipper slipper2 = new Slipper("sparx", 800, "sandal", "men", "black", 8, "india");
		System.out.println(slipper);

		boolean compare = slipper.equals(slipper2);
		System.out.println(compare);
	}

}
