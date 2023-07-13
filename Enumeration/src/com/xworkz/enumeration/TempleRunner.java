package com.xworkz.enumeration;

public class TempleRunner {

	public static void main(String[] args) {
		System.out.println("running main of Temple");
		Temple ref1 = new Temple(100);
		ref1.prasad="laddoo";
		ref1.profits=TempleProfits.PEACE;
		ref1.display();
		System.out.println();
		System.out.println("running const with all arguments of temple");
		Temple ref2 = new Temple("vishnu", 151, "kheer",TempleProfits.ENERGY);
		ref2.display();
	}

}
