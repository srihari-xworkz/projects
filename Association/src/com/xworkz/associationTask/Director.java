package com.xworkz.associationTask;

public class Director {
	String directorName;
	String productionHouse;
	int noOfFilms=100;
	String location;

Director(String directorName, String productionHouse, int noOfFilms, String location)
{
	this.directorName=directorName;
	this.productionHouse=productionHouse;
	this.location=location;
	this.noOfFilms=noOfFilms;
}

Movie movie = new Movie(250, "bahubali2", "prabhas", "anushka");

void printInfo()
{
	System.out.println("running printInfo of Director");
	System.out.println(directorName);
	System.out.println(productionHouse);
	System.out.println(noOfFilms);
	System.out.println(location);
	System.out.println();
	this.movie.printInfo();
}
}
