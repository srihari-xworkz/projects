package com.xworkz.diamondproblem.jacket;

public class JacketImplement implements Jacket, LeatherJacket, JeansJacket {

	@Override
	public int cost() {
		System.out.println("each jacket cost: 1800");
		return 1800;
	}

	@Override
	public String leather() {
		System.out.println("leather used is: normal");
		return "normal";
	}

	@Override
	public void brand() {
		System.out.println("implementing brand of Jacket");
	}

}
