package com.xworkz.interfaces.app;

public class BoysHostel implements HostelRules {

	@Override
	public void entryRule() {
		System.out.println("Should enter hostel before 11pm");
	}

	@Override
	public void maintainRule() {
		System.out.println("all should maintain cleanliness");
	}

}
