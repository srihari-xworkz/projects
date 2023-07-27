package com.xworkz.equallsmethod.app;

public class Assets {
	private String type;
	private double wealth;
	private int count;

	@Override
	public String toString() {

		return "type: " + type + " wealth: " + wealth + " count: " + count;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("argument is not null, can compare");
			if (obj instanceof Assets) {
				System.out.println("both are same ");
				Assets cast = (Assets) obj;
				if (this.type == cast.type && this.wealth == cast.wealth && this.count == count) {
					return true;
				} else {
					System.err.println("both are not same");
				}
			} else {
				System.err.println("type mismatch");
			}
		} else {
			System.out.println("argument is null, cannot compare");
		}

		return super.equals(obj);
	}

	public Assets() {
		super();
	}

	public Assets(String type, double wealth, int count) {
		super();
		this.type = type;
		this.wealth = wealth;
		this.count = count;
	}

}
