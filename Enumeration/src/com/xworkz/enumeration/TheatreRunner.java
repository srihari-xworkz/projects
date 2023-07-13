package com.xworkz.enumeration;

public class TheatreRunner {

	public static void main(String[] args) {
		System.out.println("running main of TheatreRunner");
		Theatre ref = new Theatre(800);
		ref.location="orion";
		ref.type=SeatType.BALCONY;
		ref.display();
		System.out.println();
		System.out.println("running const of Theatre");
		Theatre ref2 = new Theatre("Shanti", 600, "vijayNagar", SeatType.CORNER);
		ref2.display();
	}

}
