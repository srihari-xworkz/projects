package com.xworkz.interfaces.app;

public class ArmyImplement implements ArmyRule, IndianArmy {


	@Override
	public void leave() {
		System.out.println("no guarantee of leave approval");

	}

	@Override
	public void service() {
		System.out.println("one can serve army for 14 years");
	}

}
