package com.xworkz.enumeration;

public class Theatre {
	String theatreName="pvr";
	int ticketPrice;
	String location;
	SeatType type;
	
Theatre(int ticketPrice)
{
	this.ticketPrice=ticketPrice;
}

Theatre(String theatreName,int ticketPrice,String location,SeatType type)
{
	this(ticketPrice);
	this.theatreName=theatreName;
	this.location=location;
	this.type=type;
}
void place(String location)
{
	this.location=location;
}

void display()
{
	System.out.println(theatreName);
	System.out.println(ticketPrice);
	System.out.println(location);
	System.out.println(type);
}
}
