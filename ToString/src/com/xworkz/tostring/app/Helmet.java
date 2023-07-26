package com.xworkz.tostring.app;

public class Helmet {
	private String isFor;
	private String brand;
	private String quality; 
	private int cost;
	private String type;

	@Override
	public String toString() {
		
		return "isFor: " + isFor +"\n"+ "brand: " + brand +"\n"+ "quality: " + quality +"\n"+ "cost " + cost +"\n"+ "type " + type;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getIsFor() {
		return isFor;
	}
	
	public String getQuality() {
		return quality;
	}
	
	public String getType() {
		return type;
	}
	
	public int getCost() {
		return cost;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setQuality(String quality) {
		this.quality = quality;
	}
	
	public void setIsFor(String isFor) {
		this.isFor = isFor;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
}
