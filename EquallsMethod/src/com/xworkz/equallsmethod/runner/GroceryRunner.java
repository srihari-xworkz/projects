package com.xworkz.equallsmethod.runner;
import com.xworkz.equallsmethod.app.Grocery;

public class GroceryRunner {
	public static void main(String[] args) {
		
			System.out.println("Running main in GroceryRunner");
			
			Grocery grocery=new Grocery("Reliance","fruits");
			System.out.println(grocery);
			
			Grocery grocery2=new Grocery("Reliance", "fruit");
			System.out.println(grocery2);
			System.out.println();
			
			boolean isEquall=grocery.equals(grocery2);
			
			System.out.println("is grocery equalls to grocery2 "+ isEquall);
			
	}
}
