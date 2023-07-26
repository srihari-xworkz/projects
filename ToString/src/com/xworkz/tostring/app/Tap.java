package com.xworkz.tostring.app;

public class Tap {

	private String type;
	private String madeOf;
	private String suitableFor;
	private String color;
	private int warranty;
	
	@Override
	public String toString() {
		
		return "type: " + type +"\n"+ "madeOf: " + madeOf +"\n"+ "suitableFor: " + suitableFor +"\n"+ "color " + color +"\n"+ "warranty " + warranty;
	}
	
	public String getType() {
		return type;
	}
	
	public String getMadeOf() {
		return madeOf;
	}
	
	public String getSuitableFor() {
		return suitableFor;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getWarranty() {
		return warranty;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setMadeOf(String madeOf) {
		this.madeOf = madeOf;
	}
	
	public void setSuitableFor(String suitableFor) {
		this.suitableFor = suitableFor;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
}
