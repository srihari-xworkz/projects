package com.xworkz.equallsmethod.runner;

import com.xworkz.equallsmethod.app.Gold;

public class GoldRunner {

	public static void main(String[] args) {

		System.out.println("running main of GoldRunner");

		Gold gold = new Gold(24, 60000, "tanishq", "ring");
		System.out.println(gold);
		System.out.println();

		Gold gold2 = new Gold(22, 60000, "tanishq", "necklace");
		System.out.println(gold2);

		boolean compare = gold.equals(gold2);
		System.out.println(compare);
	}

}
