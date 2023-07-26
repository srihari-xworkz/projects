package com.xworkz.prime.runner;

import com.xworkz.prime.app.*;

public class ClassRunner {

	public static void main(String[] args) {

		System.out.println("Running main method in  ClassRunner");
		System.out.println();

		Object obj1 = new Finance();
		System.out.println(obj1);

		Finance finance = new Finance();
		finance.toString();
		
		System.out.println();

		Object obj2 = new Ladoo();
		System.out.println(obj2);

		Ladoo ladoo = new Ladoo();
		ladoo.toString();
		
		System.out.println();

		Object obj3 = new Lake();
		obj3.toString();
		System.out.println(obj3);

		Lake lake = new Lake();
		lake.toString();
		
		System.out.println();

		Object obj4 = new Lotus();
		System.out.println(obj4);

		Lotus lotus = new Lotus();
		lotus.toString();
		
		System.out.println();

		Object obj5 = new MLA();
		System.out.println(obj5);

		MLA mla = new MLA();
		mla.toString();
		
		System.out.println();

		Object obj6 = new Money();
		System.out.println(obj6);

		Money money = new Money();
		money.toString();
		
		System.out.println();

		Object obj7 = new President();
		System.out.println(obj7);

		President president = new President();
		president.toString();
		
		System.out.println();

		Object obj8 = new PrimeMinister();
		System.out.println(obj8);

		PrimeMinister pm = new PrimeMinister();
		pm.toString();
		
		System.out.println();

		Object obj9 = new River();
		System.out.println(obj9);

		River river = new River();
		river.toString();
		
		System.out.println();

		Object obj10 = new Security();
		System.out.println(obj10);

		Security security = new Security();
		security.toString();
	}

}
