package com.xworkz.interfaces.Runner;

import com.xworkz.interfaces.app.*;

public class ClassRunner {

	public static void main(String[] args) {

		System.out.println("running main for AirportRule");
		BangaloreAirport air = new BangaloreAirport();
		System.out.println("name of bnglr airport is " + air.NAME);
		air.getVerify();
		air.getVisa();
		System.out.println();

		System.out.println("running main for TempleRules");
		TempleRule temple = new TirupatiRule();
		System.out.println("located in " + temple.location);
		temple.dressRule();
		temple.hairRule();
		System.out.println();

		System.out.println("running main for HostelRules");
		HostelRules hostel = new BoysHostel();
		System.out.println("talking about " + hostel.type);
		hostel.entryRule();
		hostel.maintainRule();
		System.out.println();

		System.out.println("running main for ArmyRules");
		ArmyImplement army = new ArmyImplement();
		army.service();
		army.leave();
		System.out.println();
	}

}
