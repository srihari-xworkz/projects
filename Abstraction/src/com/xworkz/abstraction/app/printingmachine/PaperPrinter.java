package com.xworkz.abstraction.app.printingmachine;

public class PaperPrinter {
	private PrintingMachine printingMachine;

	public PaperPrinter(PrintingMachine printingMachine) {
		this.printingMachine = printingMachine;
		System.out.println("printing machine arg const of paper printer");
	}

	public void check() {
		if (printingMachine != null) {
			System.out.println("not null");
			this.printingMachine.print();
		} else {
			System.out.println("null");
		}
	}
}
