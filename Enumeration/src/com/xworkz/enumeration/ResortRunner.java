package com.xworkz.enumeration;

public class ResortRunner {

	public static void main(String[] args) {
		System.out.println("running main of resort runner");
		Resort ref = new Resort("mr.williamson");
		ref.food("masalDosa");
		ref.roomType=ResortRoom.SINGLE;
		ref.display();
		System.out.println();
		System.out.println("running constructor with arguments");
		Resort ref2 = new Resort("palaceMania", "jacob", ResortRoom.AC, "sandwich");
		ref2.display();
	}

}
