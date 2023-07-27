package com.xworkz.equallsmethod.app;

public class Gold {
	private int carat;
	private double price;
	private String shop;
	private String ornament;

	@Override
	public String toString() {

		return "carat: " + carat + " price: " + price + " shop: " + shop + " ornament: " + ornament;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("not null, can compare");
			if (obj instanceof Gold) {
				System.out.println("both are same");
				Gold cast = (Gold) obj;
				if (this.carat == cast.carat && this.price == cast.price && this.shop == shop
						&& this.ornament == ornament) {
					return true;
				} else {
					System.err.println("both are not same");
				}
			} else {
				System.err.println("type mismatch");
			}
		} else {
			System.err.println("null, cannot compare");
		}
		return false;

	}

	public Gold() {
		super();
	}

	public Gold(int carat, double price, String shop, String ornament) {
		super();
		this.carat = carat;
		this.price = price;
		this.shop = shop;
		this.ornament = ornament;
	}

}
