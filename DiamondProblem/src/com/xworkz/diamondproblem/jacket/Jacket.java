package com.xworkz.diamondproblem.jacket;

public interface Jacket {

	void brand();

	default boolean available() {
		System.out.println("Do you have a jacket");
		return false;
	}
}
