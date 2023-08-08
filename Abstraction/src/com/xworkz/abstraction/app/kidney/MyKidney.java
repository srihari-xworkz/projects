package com.xworkz.abstraction.app.kidney;

public class MyKidney {
	private Kidney kidney;

	public MyKidney(Kidney kidney) {
		this.kidney = kidney;
		System.out.println("kidney arg of MyKidney");
	}

	public void check() {
		if (kidney != null) {
			System.out.println("not null");
			this.kidney.clean();
		} else {
			System.out.println("null, kidney not working");
		}
	}
}
