package com.xworkz.Hierarchy;

public class FamilyCourt extends CivilCourt{
	
	void divorce()
	{
		System.out.println("solves divorce problems");
	}
	
	@Override
	void propertyCase()
	{
		System.out.println("solves property cases");
	}
	@Override
	void theftCase()
	{
		System.out.println("solves theft case");
	}
}
