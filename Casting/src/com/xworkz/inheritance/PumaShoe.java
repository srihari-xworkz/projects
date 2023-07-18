package com.xworkz.inheritance;

public class PumaShoe extends Shoe {
	String model;
	String origin;
	
	public PumaShoe(String model, String origin, int price, ShoeSize size, ShoeColor color) {
		super(price,size,color);
		this.model=model;
		this.origin=origin;
		System.out.println("invoking const of PumaShoe");
	}
	

	void printInfo()
	{
		System.out.println("model of pumaShoe is :" + model);
		System.out.println("origin of pumaShoe is :" + origin);
	}
}


