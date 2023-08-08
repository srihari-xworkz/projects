package com.xworkz.diamondproblem.School;

public interface GoodSchool {

	void start();

	default void schoolType() {
		System.out.println("has both primary and high schools");
	}

}
