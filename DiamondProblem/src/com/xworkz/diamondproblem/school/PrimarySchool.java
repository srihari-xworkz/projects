package com.xworkz.diamondproblem.School;

public interface PrimarySchool extends GoodSchool {

	default void beginsFrom() {
		System.out.println("primary is from 1st to 7th");
	}

}
