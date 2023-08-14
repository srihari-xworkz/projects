package com.xworkz.crudop2.runner;

import com.xworkz.crudop2.app.Country;
import com.xworkz.crudop2.app.CountryImpl;

public class CountryRunner {

	public static void main(String[] args) {

		Country country = new CountryImpl();
		country.save("india");
		country.save("usa");
		country.save("uae");
		country.save("singapore");
		country.save("china");
		country.save("canada");
		country.save("france");
		country.save("argentina");
		country.save("germany");
		country.save("colombia");

		System.out.println();

		country.display();
		System.out.println();

		country.isExist("USA");
		System.out.println();

		System.out.println(country.findReturnUppercase("germany"));
		System.out.println();

		String[] preMatch = country.findStartsWith("c");
		System.out.println("country names starting with c- ");
		for (int i = 0; i < preMatch.length; i++) {
			if (preMatch[i] != null)
				System.out.println(preMatch[i]);
		}
		System.out.println();

		String[] postMatch = country.findEndWith("a");
		System.out.println("country names ending with a-");
		for (int i = 0; i < postMatch.length; i++) {
			if (postMatch[i] != null)
				System.out.println(postMatch[i]);
		}
		System.out.println();

		String[] matchReturn = country.findMatching("france");
		System.out.println("printing all matching elements");
		for (int i = 0; i < matchReturn.length; i++) {
			if (matchReturn[i] != null)
				System.out.println(matchReturn[i]);
		}
		System.out.println();

		System.out.println("toal saved count is " + country.savedCount());
		System.out.println();

		String asc[] = country.orderAscen();
		System.out.println("printing array in ascending order");
		for (int i = 0; i < asc.length; i++) {
			System.out.print(asc[i] + " ");
		}
		System.out.println();

		System.out.println();

		String desc[] = country.orderDesc();
		System.out.println("printing array in descending order");
		for (int i = 0; i < desc.length; i++) {
			System.out.print(desc[i] + " ");
		}

	}

}
