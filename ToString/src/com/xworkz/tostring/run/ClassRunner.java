package com.xworkz.tostring.run;

import com.xworkz.tostring.app.*;

public class ClassRunner {

	public static void main(String[] args) {

		System.out.println("running main of Dosa");
		Dosa dosa = new Dosa();
		System.out.println(dosa);
		dosa.setType("masala");
		dosa.setCost(50);
		dosa.setLocation("athithya");
		dosa.setTasty(true);
		dosa.setQuantity(1.50);
		System.out.println();
		System.out.println("printing values of Dosa properties");
		System.out.println(dosa);
		System.out.println();
		
		System.out.println("running main of Satellite");
		Satellite satellite = new Satellite();
		System.out.println(satellite);
		satellite.setName("chandrayan");
		satellite.setLaunchFrom("srihariKota");
		satellite.setDate("4-july-2023");
		satellite.setSuccessfull(true);
		satellite.setValuation(250);
		System.out.println("printing values of Satellite properties");
		System.out.println(satellite);
		System.out.println();
		
		System.out.println("running main of Calculator");
		Calculator calci=new Calculator();
		System.out.println(calci);
		calci.setBrand("casio");
		calci.setTypeOf("scientific");
		calci.setUsage("calculations");
		calci.setAllowed(false);
		calci.setOperations(50);
		System.out.println();
		System.out.println("printing values of calculator properties");
		System.out.println(calci);
		System.out.println();
		
		System.out.println("running main of NewsPaper");
		NewsPaper paper = new NewsPaper();
		System.out.println(paper);
		paper.setName("The Hindu");
		paper.setPages(10);
		paper.setPrice(10);
		paper.setHasArrived(true);
		paper.setRead(true);
		System.out.println();
		System.out.println("printing values of NewsPaper properties");
		System.out.println(paper);
		System.out.println();
		
		System.out.println("running main of HeadSet");
		HeadSet set = new HeadSet();
		System.out.println(set);
		set.setCompany("Boat");
		set.setHave(true);
		set.setNoOfHeadsets(2);
		set.setRange(10);
		set.setBluetooth(true);
		System.out.println();
		System.out.println("printing values of HeadSet properties");
		System.out.println(set);
		System.out.println();
		
		System.out.println("running main of Helmet");
		Helmet helmet = new Helmet();
		System.out.println(helmet);
		helmet.setBrand("steelBird");
		helmet.setCost(800);
		helmet.setIsFor("bikes");
		helmet.setQuality("fibre");
		helmet.setType("half face");
		System.out.println();
		System.out.println("printing values of Helmet properties");
		System.out.println(helmet);
		System.out.println();
		
		System.out.println("running main of tap");
		Tap tap = new Tap();
		System.out.println(tap);
		tap.setColor("white");
		tap.setMadeOf("steel");
		tap.setSuitableFor("home");
		tap.setType("handle");
		tap.setWarranty(5);
		System.out.println();
		System.out.println("printing values of tap properties");
		System.out.println(tap);
		System.out.println();
		
		System.out.println("running main of Grinder");
		Grinder grind = new Grinder();
		System.out.println(grind);
		grind.setJars(4);
		grind.setMaterial("plastic");
		grind.setRpm(300);
		grind.setVolume(1.25);
		grind.setWatts(20);
		System.out.println();
		System.out.println("printing values of tap properties");
		System.out.println(tap);
		System.out.println();

	}

}
