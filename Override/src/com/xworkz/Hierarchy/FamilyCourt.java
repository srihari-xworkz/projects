package com.xworkz.Hierarchy;

public class FamilyCourt extends CivilCourt{
	
	void divorce()
	{
		System.out.println("solves divorce problems");
	}
	
	@Override
	void propertyCase()
	{
		System.out.println("overridden propertyCases");
	}
	@Override
	void theftCase()
	{
		System.out.println("overridden theftCase");
	}
}
