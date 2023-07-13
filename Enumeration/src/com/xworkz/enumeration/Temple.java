package com.xworkz.enumeration;

public class Temple {
	String templeOf="ganesha";
	int donate;
	String prasad;
	TempleProfits profits;
	
Temple(int donate)
{
	this.donate=donate;
}

Temple(String templeOf,int donate,String prasad,TempleProfits profits)
{
	this(donate);
	this.templeOf=templeOf;
	this.prasad=prasad;
	this.profits=profits;
}

void bless(String prasad)
{
	this.prasad=prasad;
}

void display()
{
	System.out.println(templeOf);
	System.out.println(donate);
	System.out.println(prasad);
	System.out.println(profits);
}
}
