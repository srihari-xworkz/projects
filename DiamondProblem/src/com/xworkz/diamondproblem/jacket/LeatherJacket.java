package com.xworkz.diamondproblem.jacket;

public interface LeatherJacket extends Jacket {

	String leather();

	default void jacketType() {
		System.out.println("default method of leatherJacket");
	}

}
