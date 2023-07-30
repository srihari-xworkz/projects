package com.xworkz.recall.app;

public class GrandParent {

	public int level1;
	public int children;

	public GrandParent() {
		super();
	}

	public GrandParent(int level1, int children) {
		super();
		this.level1 = level1;
		this.children = children;
		System.out.println("-----constructor of class GrandParent-----");
		System.out.println("level1: " + level1 + "\nchildren: " + children);
	}

}
