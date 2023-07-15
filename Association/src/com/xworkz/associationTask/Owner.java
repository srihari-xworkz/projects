package com.xworkz.associationTask;

public class Owner {
	String ownerName;
	String startDate;
	double valuation;	
	boolean partnership;
	
Owner(String ownerName, String startDate, double valuation, boolean partnership)
{
	this.ownerName=ownerName;
	this.startDate=startDate;
	this.valuation=valuation;
	this.partnership=partnership;
}

Hotel hotel = new Hotel("Taj", "mumbai", true, true);

void printInfo()
{
	System.out.println("printing info of Owner");
	System.out.println(ownerName);
	System.out.println(startDate);
	System.out.println(valuation);
	System.out.println(partnership);
	System.out.println();
	this.hotel.printInfo();
}
}
