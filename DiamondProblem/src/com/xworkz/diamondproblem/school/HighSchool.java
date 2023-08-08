package com.xworkz.diamondproblem.School;

public interface HighSchool extends GoodSchool {

	default void hasClass() {
		System.out.println("high school is fromm 8 to 10");
	}

}
