package com.xworkz.enumeration;

public class BatteryRunner {
	public static void main(String[] args) {
		System.out.println("running main of BatteryRunner");
		
		Battery ref1 = new Battery(2000);
		ref1.usedIn="toys";
		ref1.company=BatteryCompany.DURACELL;
		ref1.display();
		
		System.out.println();
		
		System.out.println("running Battery const with all const");
		Battery ref2 = new Battery(1800, 150, "vehicles", BatteryCompany.EXIDE);
		ref2.display();
	}
}
