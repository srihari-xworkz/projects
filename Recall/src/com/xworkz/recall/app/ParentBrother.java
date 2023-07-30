package com.xworkz.recall.app;

public class ParentBrother extends GrandParent {

	public String childOf;

	public ParentBrother(int level1, int children, String childOf) {
		super(level1, children);
		this.childOf = childOf;
		System.out.println("Invoking constructor of Class ParentBrother");
		System.out.println("Constructor of ParentBrother inherits GrandParent showing Hierarchial Iheritance.....");
		System.out.println("ChildOf: " + childOf);
	}

}
