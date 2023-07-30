package com.xworkz.recall.app;

public class Parent extends GrandParent {

	public int level2;
	public int son;
	public boolean inherits;

	public Parent(int level2, int son, int level1, int children) {
		super(level1, children);
		this.level2 = level2;
		this.son = son;
		System.out.println("super chaining of parent with GrandParent");
		System.out.println("level2: " + level2 + "\nson: " + son);
	}

	public Parent(int level2, int son, boolean inherits) {
		this.level2 = level2;
		this.son = son;
		this.inherits = inherits;
		System.out.println("constructor overloading of parent.....");
		System.out.println("level2: " + level2 + "\nson: " + son + "\nInherits: " + inherits);
	}

}
