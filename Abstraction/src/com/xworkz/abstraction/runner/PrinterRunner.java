package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.printingmachine.Canon;
import com.xworkz.abstraction.app.printingmachine.PaperPrinter;
import com.xworkz.abstraction.app.printingmachine.PrintingMachine;

public class PrinterRunner {
	public static void main(String[] args) {

		System.out.println("main of PrinterRunner");
		PrintingMachine printing = new Canon();

		PaperPrinter paper = new PaperPrinter(printing);
		paper.check();
	}

}
