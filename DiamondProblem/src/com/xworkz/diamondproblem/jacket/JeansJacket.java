package com.xworkz.diamondproblem.jacket;

public interface JeansJacket extends Jacket {

	int cost();

	default void jacketColor() {
		System.out.println("usually is of blue color");
	}

}
