package com.xworkz.associationTask;

public class FranchiseRunner {
	public static void main(String[] args) {
		System.out.println("running main of iplteam-franchise association");
		Franchise franchise = new Franchise("chennai", "icltd", 752, 11);
		franchise.printInfo();
	}
}
