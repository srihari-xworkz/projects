package com.xworkz.Hierarchy;

public class HighCourt extends SupremeCourt{
	
	void criminalCase()
	{
		System.out.println("handles criminal cases");
	}
	void forgeryCase()
	{
		System.out.println("handles forgery cases");
	}
	
	@Override
	void importantCase()
	{
		System.out.println("overridden importantCase()");
	}
	@Override
	void justice()
	{
		System.out.println("overridden forgeryCase()");
	}

}

