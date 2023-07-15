package com.xworkz.associationTask;

public class Hotel {
	String hotelName;
	String location;
	boolean openClose;
	boolean like;
	
Hotel(String hotelName, String location, boolean openClose, boolean like)
{
	this.hotelName=hotelName;
	this.location=location;
	this.openClose=openClose;
	this.like=like;
}

void printInfo()
{
	System.out.println("printing info of hotel");
	System.out.println(hotelName);
	System.out.println(location);
	System.out.println(openClose);;
	System.out.println(like);
}

}
