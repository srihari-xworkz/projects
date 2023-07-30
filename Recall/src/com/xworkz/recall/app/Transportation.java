package com.xworkz.recall.app;

public class Transportation {

	final int marks;

	public void ways() {
		System.out.println("there are three types of transport");
//		marks = 50;  shows an error 
	}

	public Transportation() {
		this.marks = 60;
		System.out.println("initialising final variable through const \n marks: " + marks);
	}

	public final void finalMethod() {
		System.out.println("final method of transportation");
	}

}
