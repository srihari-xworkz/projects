package com.xworkz.enumeration;

public class Mall {
	String place="majestic";
	int distance;
	int rating;
	MallName name;
	
Mall(int distance)
{
	this.distance=distance;
}

Mall(String place,int distance,int rating,MallName name)
{
	this.place=place;
	this.distance=distance;
	this.rating=rating;
	this.name=name;
}

void review(int rating)
{
	this.rating=rating;
}

void display()
{
	System.out.println(place);
	System.out.println(distance);
	System.out.println(rating);
	System.out.println(name);
}
}
