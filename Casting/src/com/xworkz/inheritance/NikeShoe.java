package com.xworkz.inheritance;

public class NikeShoe extends Shoe {
	String ceo;
	String brandAmbassador;
	
	public NikeShoe(String ceo, String brandAmbassador, int price, ShoeSize size, ShoeColor color) {
		super(price,size,color);
		this.ceo=ceo;
		this.brandAmbassador=brandAmbassador;
		System.out.println("invoking const of NikeShoe");

	}
	
	void printInfo()
	{
		System.out.println("ceo of NikeShoe is :" + ceo);
		System.out.println("brandAmbassador of NikeShoe is :" + brandAmbassador);
	}
}
