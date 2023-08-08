package com.xworkz.diamondproblem.jacket;

public class JacketRunner {

	public static void main(String[] args) {

		Jacket jacket = new JacketImplement();
		jacket.available();
		jacket.brand();

		LeatherJacket leather = new JacketImplement();
		leather.available();
		leather.brand();
		leather.leather();

		JeansJacket jeans = new JacketImplement();
		jeans.available();
		jeans.brand();
		jeans.cost();

		JacketImplement ji = new JacketImplement();
		ji.available();
		ji.brand();
		ji.cost();
		ji.jacketType();

	}

}
