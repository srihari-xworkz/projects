package com.xworkz.inheritance;

public class ShoeUtil {
	
	static void buy(Shoe shoe)
	{
		if(shoe!=null)
		{
			System.out.println("shoe price :" + shoe.price);
			System.out.println("shoe size is :" + shoe.size);
			System.out.println("shoe color is :" + shoe.color);
			
			if(shoe instanceof PumaShoe)
			{	
				PumaShoe puma = (PumaShoe)shoe;
				puma.printInfo();
			}
			if(shoe instanceof NikeShoe)
			{
				NikeShoe nike = (NikeShoe)shoe;
				nike.printInfo();
			}
		}
	}
}
