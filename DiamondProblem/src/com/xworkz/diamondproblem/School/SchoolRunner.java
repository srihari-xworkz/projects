package com.xworkz.diamondproblem.School;

public class SchoolRunner {

	public static void main(String[] args) {

		GoodSchool good = new SchoolImplement();
		good.schoolType();
		good.start();

		HighSchool high = new SchoolImplement();
		high.schoolType();
		high.hasClass();
		high.start();

		PrimarySchool primary = new SchoolImplement();
		primary.schoolType();
		primary.start();
		primary.beginsFrom();

		SchoolImplement school = new SchoolImplement();
		school.start();
		school.schoolType();
		school.hasClass();
		school.beginsFrom();

	}

}
