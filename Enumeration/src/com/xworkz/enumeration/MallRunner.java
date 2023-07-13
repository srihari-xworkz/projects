package com.xworkz.enumeration;

public class MallRunner {
	public static void main(String[] args) {
		System.out.println("running main of MallRunner ");
		Mall ref1 = new Mall(18);
		ref1.rating=5;
		ref1.name=MallName.ORION;
		ref1.display();
		
		System.out.println();
		
		System.out.println("running const with all arguments of Mall");
		Mall ref2 = new Mall("btm", 6, 3, MallName.GOPALAN);
		ref2.display();
	}
}
