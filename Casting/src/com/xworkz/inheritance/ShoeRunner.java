package com.xworkz.inheritance;

public class ShoeRunner {

	public static void main(String[] args) {
		System.out.println("running main of ShoeRunner ....");
		System.out.println();
		
		Shoe shoe = new Shoe(750,  ShoeSize.SHOE9, ShoeColor.WHITE);
		ShoeUtil.buy(shoe);
		System.out.println();
		
		Shoe puma = new PumaShoe("Sneakers", "germany", 800, ShoeSize.SHOE8, ShoeColor.BROWN);
		ShoeUtil.buy(puma);
		System.out.println();
		
		Shoe nike = new NikeShoe("Donahoe", "woods", 600, ShoeSize.SHOE7, ShoeColor.GREY);
		ShoeUtil.buy(nike);
		
	}
	

}
