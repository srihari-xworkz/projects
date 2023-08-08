package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.kidney.BodyKidney;
import com.xworkz.abstraction.app.kidney.Kidney;
import com.xworkz.abstraction.app.kidney.MyKidney;

public class KidneyRunner {

	public static void main(String[] args) {
		
		System.out.println("main of Kidney");
		
		Kidney kidney = new BodyKidney();
		MyKidney my = new MyKidney(kidney);
		my.check();

	}

}
