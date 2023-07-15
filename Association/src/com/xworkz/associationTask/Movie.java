package com.xworkz.associationTask;

public class Movie {
	int budget=150;
	String name;
	String heroName;
	String actress;

Movie(int budget, String name, String heroName, String actress)
{
	this.name=name;
	this.budget=budget;
	this.heroName=heroName;
	this.actress=actress;
}

void printInfo()
{
	System.out.println("running printInfo of Movie");
	System.out.println(budget);
	System.out.println(name);
	System.out.println(heroName);
	System.out.println(actress);
}

}
