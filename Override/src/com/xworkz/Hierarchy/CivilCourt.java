package com.xworkz.Hierarchy;

public class CivilCourt extends HighCourt{
	
	void propertyCase()
	{
		System.out.println("solves property cases");
	}
	void theftCase()
	{
		System.out.println("solves theft case");
	}
	
	@Override
	void criminalCase()
	{
		System.out.println("handles criminal cases");
	}
	@Override
	void forgeryCase()
	{
		System.out.println("handles forgery cases");
	}
	
}
