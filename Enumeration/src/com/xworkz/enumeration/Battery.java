package com.xworkz.enumeration;

public class Battery {
	int watt=10;
	int cost;
	String usedIn;
	BatteryCompany company;
	
Battery(int cost)
{
	this.cost=cost;
}

Battery(int cost,int watt,String usedIn,BatteryCompany company)
{
	this(cost);
	this.watt=watt;
	this.usedIn=usedIn;
	this.company=company;
}
void uses(String usedIn)
{
	this.usedIn=usedIn;
}

void display()
{
	System.out.println(watt);
	System.out.println(cost);
	System.out.println(usedIn);
	System.out.println(company);
}
}
