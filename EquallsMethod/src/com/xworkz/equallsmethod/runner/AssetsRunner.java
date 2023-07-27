package com.xworkz.equallsmethod.runner;

import com.xworkz.equallsmethod.app.Assets;

public class AssetsRunner {

	public static void main(String[] args) {

		System.out.println("running main of Assets");

		Assets first = new Assets("land",12.50,5);
		System.out.println(first);
		System.out.println();

		Assets second = new Assets("land",12.60,5);
		System.out.println(second);
		System.out.println();

		boolean same = first.equals(second);
		System.out.println("both ref are pointing to same object? "+same);

	}

}
