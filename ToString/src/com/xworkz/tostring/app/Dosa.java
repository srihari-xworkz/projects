package com.xworkz.tostring.app;

public class Dosa {
	private String type;
	private int cost;
	private boolean isTasty;
	private double quantity;
	private String location;
	
	@Override
	public String toString() {
		
		return "type: " + type +"\n"+ "cost: " + cost +"\n"+ "isTasty: " + isTasty +"\n"+ "quantity " + quantity +"\n"+ "location " + location;
	}

	public String getType() {
		return type;
	}

	public int getCost() {
		return cost;
	}

	public String getLocation() {
		return location;
	}

	public double getQuantity() {
		return quantity;
	}

	public boolean getisTasty() {
		return isTasty;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	public void setTasty(boolean isTasty) {
		this.isTasty = isTasty;
	}
}
