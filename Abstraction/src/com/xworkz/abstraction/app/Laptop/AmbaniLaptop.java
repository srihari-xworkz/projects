package com.xworkz.abstraction.app.Laptop;

public class AmbaniLaptop {
	private Laptop laptop;

	public AmbaniLaptop(Laptop laptop) {
		this.laptop = laptop;
		System.out.println("laptop arg const of AmbaniLaptop");
	}

	public void check() {
		if (laptop != null) {
			System.out.println("not null");
			this.laptop.display();
		} else {
			System.out.println("null");
		}
	}

}
