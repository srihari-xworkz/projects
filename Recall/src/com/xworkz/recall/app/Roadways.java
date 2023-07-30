package com.xworkz.recall.app;

public final class Roadways extends Transportation {

	public static void cast(Transportation tr) {
		if (tr instanceof Roadways) {
			Roadways r = (Roadways) tr;
			System.out.println("roadways is an example of Transportation");
		} else {
			System.out.println("is not an instance...");
		}
	}

	public static void fourWheeler() {
		System.out.println("method of final class which cannot be extended");
	}

}
