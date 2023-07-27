package com.xworkz.equallsmethod.runner;

import com.xworkz.equallsmethod.app.DryFruit;

public class DryFruitRunner {

	public static void main(String[] args) {

		DryFruit fruit = new DryFruit("badam", 5, "memory", 2.55, 100, 150);
		System.out.println(fruit);

		DryFruit fruit2 = new DryFruit("almond", 5, "memory", 2.55, 120, 150);
		System.out.println(fruit2);

		boolean check = fruit.equals(fruit2);
		System.out.println(check);
	}

}
