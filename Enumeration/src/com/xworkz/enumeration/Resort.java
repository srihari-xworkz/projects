package com.xworkz.enumeration;

public class Resort {
	String name="mariotte";
	String ownerName;
	ResortRoom roomType;
	String breakFast;	

Resort(String ownerName)
{
	this.ownerName=ownerName;
}

Resort(String name,String ownerName,ResortRoom roomType,String breakFast)
{
	this(ownerName);
	this.name=name;
	this.roomType=roomType;
	this.breakFast=breakFast;
}

void food(String breakFast)
{
	this.breakFast=breakFast;
}

void display()
{
	System.out.println(name);
	System.out.println(ownerName);
	System.out.println(breakFast);
	System.out.println(roomType);
}

}
