package com.xworkz.recall.app;

public class Child extends Parent {
	public int generation;
	public String gender;

	public Child(int level2, int son, int level1, int children, int generation, String gender) {
		super(level2, son, level1, children);
		this.generation = generation;
		this.gender = gender;
		System.out.println(".....constructor of Child Class indicating multiLevel Inheritance.....");
		System.out.println("generation: " + generation + "\ngender: " + gender);
	}

	public void printInfo(String homeTown) {
		System.out.println("invoking method of child");
		System.out.println("hometown: " + homeTown);
	}

	public void printInfo(boolean isGrandChild) {
		System.out.println("achieving runtime poly by method overloading of Child \nisGrandChild: " + isGrandChild);
	}
	
}
