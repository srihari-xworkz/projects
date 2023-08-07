package com.xworkz.interfaces.app;

public class BangaloreAirport implements AirportRule {

	@Override
	public void getVisa() {
		System.out.println("must have a visa");

	}

	@Override
	public void getVerify() {
		System.out.println("should get verified before boarding");

	}

}
